interface Accessable
{
    void haveAccess();
}
class Person {
    private int age;
    private String name;
    private boolean isAdmin;

    public Person(int age, String name, boolean isAdmin) {
        this.age = age;
        this.name = name;
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Student1 extends Person
{
    private int year;

    public Student1(int age, String name, int year, boolean isAdmin) {
        super(age,name,isAdmin);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class Teacher1 extends Person
{
    private String specialization;

    public Teacher1(int age, String name, String specialization, boolean isAdmin) {
        super(age, name, isAdmin);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}

class Admin extends Person
{
    private int adminId;

    public Admin(int age, String name, int adminId, boolean isAdmin) {
        super(age, name, isAdmin);
        this.adminId = adminId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
}

class Records implements Accessable{

    protected Person person;

    public Records(Person person)
    {
        this.person = person;
    }

    @Override
    public void haveAccess() {
        System.out.println("Record are Accessable !!");
    }
}

class RecordsProxy extends Records{
    public RecordsProxy(Person person){
        super(person);
    }

    @Override
    public void haveAccess() {
        if(!person.isAdmin())
            System.out.println("Records Are Not Accessable");
        else
            super.haveAccess();
    }
}

public class Question_8  {

    public static void main(String[] args) {

        Student1 student = new Student1(25, "Adish", 4, false);
        Records records = new RecordsProxy(student);
        records.haveAccess();
        Admin admin = new Admin(35, "Ashish", 24, true);
        Records records1 = new RecordsProxy(admin);
        records1.haveAccess();

    }

}
