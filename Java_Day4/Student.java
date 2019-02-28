public class Student {

    double age;
    double score;
    String name;

    public Student(double age, double score, String name) {
        this.age = age;
        this.score = score;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + "\t| score : "+this.score+"";
    }
    
}
