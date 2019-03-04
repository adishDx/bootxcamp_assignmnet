class Student {

    private String name;
    private Integer id;
    private String course;
    private Integer age;
    private Integer year;

    public Student(StudentBuilder studentBuilder) {
        id = studentBuilder.getId();
        name = studentBuilder.getName();
        course = studentBuilder.getCourse();
        age = studentBuilder.getAge();
        year = studentBuilder.getYear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", course=" + course +
                ", age=" + age +
                ", year=" + year +
                '}';
    }
}


class StudentBuilder {
    private String name;
    private Integer id;
    private String course;
    private Integer age;
    private Integer year;


    public StudentBuilder(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public StudentBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getCourse() {
        return course;
    }

    public StudentBuilder setCourse(String course) {
        this.course = course;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public StudentBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Integer getYear() {
        return year;
    }

    public StudentBuilder setYear(Integer year) {
        this.year = year;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}



public class Question_4 {

    public static void main(String[] args) {

        Student student = new StudentBuilder("Adish",3289)
                .setAge(5)
                .setCourse("Btech")
                .setYear(4)
                .build();
        System.out.println(student);
    }

}
