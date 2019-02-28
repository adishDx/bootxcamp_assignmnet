import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortBySalary implements Comparator<Employee>
{
    public int compare(Employee a, Employee b){
        if(a.salary > b.salary) return 1;
        if(a.salary < b.salary) return -1;
        return 0;
    }
}




public class Question_4 {

    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee(23,400000, "Adish"));
        al.add(new Employee(23,4000000, "Ashish"));
        al.add(new Employee(23,40000, "Nitish"));
        System.out.println("In Unsorted Order : ");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        Collections.sort(al , new SortBySalary());

        System.out.println("\nIn Sorted Order : ");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
