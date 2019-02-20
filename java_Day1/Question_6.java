import java.util.HashMap;
import java.util.Scanner;
public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();

        System.out.println("Enter the Size Of Array : ");
        int s = sc.nextInt();
        int a[] = new int[s];

        System.out.println("Input Elements of First Array : ");
        for (int i = 0; i < a.length ; i++) {
            a[i] = sc.nextInt();
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i]) + 1);
            }
            else
                map.put(a[i], 1);
        }

        for(HashMap.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1) {
                System.out.println("Required Element is : " + entry.getKey());
                break;
            }
        }

        }
}
