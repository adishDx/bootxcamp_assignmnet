import java.util.HashMap;
import java.util.Scanner;

public class Question_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String s= sc.nextLine();
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String ch = ""+s.charAt(i);
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        map.remove(" ");
        System.out.println(map);
    }

}
