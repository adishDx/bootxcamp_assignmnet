import java.util.ArrayList;
import java.util.Scanner;

public class Question_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String s = sc.nextLine().toLowerCase();
        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> removables = new ArrayList<>();
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(al.contains(""+ch)) {
                al.remove("" + ch);
                removables.add(""+ch);
            }
            else
                al.add(""+ch);
        }
        al.removeAll(removables);
        System.out.println(al);
    }

}
