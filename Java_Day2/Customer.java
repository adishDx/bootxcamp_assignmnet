public class Customer {

    private String name;
    private Boolean orderStatus;
    private float cash;
    private int token;
    private int coffeeQuantity;
//    private Cashier cs;
//    private Barista bs;

    public Customer(String name, Boolean orderStatus, float cash, int token, int coffeeQuantity) {
        this.name = name;
        this.orderStatus = orderStatus;
        this.cash = cash;
        this.token = token;
        this.coffeeQuantity = coffeeQuantity;
//        this.cs = cs;
//        this.bs = bs;
    }

//    public Cashier getCs() {
//        return cs;
//    }
//
//    public void setCs(Cashier cs) {
//        this.cs = cs;
//    }
//
//    public Barista getBs() {
//        return bs;
//    }
//
//    public void setBs(Barista bs) {
//        this.bs = bs;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public float getCash() {
        return cash;
    }

    public void setCash(float cash) {
        this.cash = cash;
    }

    public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public int getCoffeeQuantity() {
        return coffeeQuantity;
    }

    public void setCoffeeQuantity(int coffeeQuantity) {
        this.coffeeQuantity = coffeeQuantity;
    }
}
