import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Question_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String s = sc.nextLine().toLowerCase();
        StringTokenizer st = new StringTokenizer(s);
        HashMap<String, Integer> map = new HashMap<>();
        int flag = 0;
//        for(int i = 0; i < st.countTokens(); i++)
//        {
//            String d = st.nextToken();
//            if(map.containsKey(d))
//                map.put(d , map.get(d) + 1);
//            else
//                map.put(d,1);
//        }
        while(st.hasMoreTokens())
        {
            String d = st.nextToken();
            if(map.containsKey(d))
                map.put(d , map.get(d) + 1);
            else
                map.put(d,1);
        }
        System.out.println("Duplicate Words Are : ");

        for(HashMap.Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1) {
                flag = 1;
                System.out.println("'" + entry.getKey() + "' repeated " + entry.getValue() + " Times.");
            }
        }
        if (flag == 0)
            System.out.println("0 :( ...Sorry No Duplicate Words");
    }

}
