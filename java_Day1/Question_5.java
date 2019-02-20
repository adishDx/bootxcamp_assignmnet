import java.util.HashMap;
import java.util.Scanner;
public class Question_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();

        System.out.println("Enter the Size Of First Array : ");
        int s1 = sc.nextInt();
        int a1[] = new int[s1];

        System.out.println("Input Elements of First Array : ");
        for (int i = 0; i < a1.length ; i++) {
            a1[i] = sc.nextInt();
            map.put(a1[i], 1);
        }

        System.out.println("Enter The Size Of Second Array : ");
        int s2 = sc.nextInt();
        int a2[] = new int[s2];

        System.out.println("Input Elements of Second Array : ");
        for (int i = 0; i < a2.length ; i++) {
            a2[i] = sc.nextInt();
        }

        System.out.println("Common Elements Between Two Array are : ");
        for (int i = 0; i < a2.length ; i++) {
            //Integer ii = new Integer(a2[i]);
            if(map.containsKey(a2[i]))
                System.out.print(a2[i] + " ");

        }




    }
}
