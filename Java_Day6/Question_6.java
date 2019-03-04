interface PizzaInfo{
    String info();
}

class Pizza implements PizzaInfo{

    private char size;
    private String type;


    public Pizza(char size, String type) {
        this.size = size;
        this.type = type;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String info() {
        return this.getType()+" Pizza Of Size "+this.getSize()+" is Ready";
    }
}

class ExtraTopping implements PizzaInfo{

    private boolean tomato;
    private boolean capsicum;
    private boolean jalapeno;
    PizzaInfo pizzaInfo;

    ExtraTopping(PizzaInfo pizzaInfo){
        this.pizzaInfo = pizzaInfo;
    }

    public boolean isTomato() {
        return tomato;
    }

    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }

    public boolean isCapsicum() {
        return capsicum;
    }

    public void setCapsicum(boolean capsicum) {
        this.capsicum = capsicum;
    }

    public boolean isJalapeno() {
        return jalapeno;
    }

    public void setJalapeno(boolean jalapeno) {
        this.jalapeno = jalapeno;
    }

    @Override
    public String info() {
        String exTop = "";
        if (this.isCapsicum() == true)
            exTop = exTop + " Capsicum ";
        if(this.isJalapeno() == true)
            exTop = exTop + "Jalapeno ";
        if (this.isTomato() == true)
            exTop = exTop + "Tomato ";
        return this.pizzaInfo.info() +" With Extra Topping ("+ exTop+" )";
    }
}

public class Question_6 {

    public static void main(String[] args) {

        Pizza pizza = new Pizza('M', "Veg");
        System.out.println(pizza.info());
        ExtraTopping extraTopping = new ExtraTopping(pizza);
        extraTopping.setCapsicum(true);
        System.out.println(extraTopping.info());
    }

}
