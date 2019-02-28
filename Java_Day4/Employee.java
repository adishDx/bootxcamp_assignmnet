public class Employee{

    double age;
    double salary;
    String name;

    public Employee(double age, double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + "\t| Salary : "+this.salary+"";
    }
}
