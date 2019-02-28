
interface fake2{
    Employee getObj(String name, String city, int age);
}

class Employee {
    String name;
    String city;
    int age;

    public Employee(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name+"\n"+this.city+"\n"+this.age;
    }
}

public class Question_4 {

    public static void main(String[] args) {

        fake2 getOb = Employee::new;
        Employee emp = getOb.getObj("Adish","Lucknow",23);
        System.out.println(emp);



    }
}

