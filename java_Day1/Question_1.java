import java.util.Scanner;
public class Question_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String s1 = sc.nextLine().toLowerCase();
        System.out.println("Enter The Sub String To be Replaced : ");
        String sub = sc.nextLine().toLowerCase();
        if(s1.indexOf(sub) == -1){
            System.out.println("SubString Doesnt Exist !!");
            return;
        }

        System.out.println("Enter the Sub String To replace : ");
        String newSub = sc.nextLine();
        s1 = s1.replace(sub,newSub);
        System.out.println("New String : "+s1);
    }

}
