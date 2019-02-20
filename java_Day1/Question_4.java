import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;
public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String s = sc.nextLine();
        HashMap<String,Integer> map= new HashMap<>();
        map.put("lower",0);
        map.put("upper",0);
        map.put("special",0);
        map.put("digits", 0);
        int dl = (int)'0';
        int du = (int)'9';
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            int ascii = (int)c;
            if(ascii >= 65 && ascii <=90)
                map.put("upper",map.get("upper") + 1);
            else if (ascii >= 97 && ascii <= 122)
                map.put("lower",map.get("lower") + 1);
            else if(ascii >= dl && ascii <= du)
                map.put("digits",map.get("digits") + 1);
            else
                map.put("special", map.get("special") + 1);
        }


        System.out.println("Number Of LowerCase Letters : "+map.get("lower"));
        System.out.println("Number Of UpperCase Letters : "+map.get("upper"));
        System.out.println("Number Of Digits : "+map.get("digits"));
        System.out.println("Number Of Special Characters : "+map.get("special"));

        float lperC = ((float)map.get("lower")/(map.get("lower")+map.get("upper")+map.get("digits")+map.get("special"))) * 100;
        float uperC = ((float)map.get("upper")/(map.get("lower")+map.get("upper")+map.get("digits")+map.get("special"))) * 100;
        float dperc = ((float)map.get("digits")/(map.get("lower")+map.get("upper")+map.get("digits")+map.get("special"))) * 100;
        float sperC = ((float)map.get("special")/(map.get("lower")+map.get("upper")+map.get("digits")+map.get("special"))) * 100;

        System.out.println("\n\n\nPercentage Of LowerCase Letters : "+lperC);
        System.out.println("Percentage Of UpperCase Letters : "+uperC);
        System.out.println("Percentage Of Digits : "+dperc);
        System.out.println("Percentage Of Special Characters : "+sperC);

    }
}
