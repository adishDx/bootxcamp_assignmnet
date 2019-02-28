import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortByScoreAndName implements Comparator<Student>
{
    public int compare(Student a, Student b){
        if(a.score > b.score) return 1;
        if(a.score < b.score) return -1;
        return a.name.compareTo(b.name);
    }
}



public class Question_5 {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(23,54, "Adish"));
        al.add(new Student(23,65, "Ashish"));
        al.add(new Student(23,40, "Nitish"));
        al.add(new Student(30,65, "Aavneet"));

        System.out.println("In Unsorted Order : ");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        Collections.sort(al , new SortByScoreAndName());

        System.out.println("\nIn Sorted Order : ");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    } 
    
}
