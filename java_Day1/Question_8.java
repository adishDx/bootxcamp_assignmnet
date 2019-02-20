import java.util.Scanner;

public class Question_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String s = sc.nextLine().toLowerCase();
        StringBuffer sb = new StringBuffer(s);
        System.out.println("Reversed String : "+sb.reverse());
        System.out.println("String After Removing Characters From index 4 to 9 :"+sb.replace(4,10,""));
    }
}