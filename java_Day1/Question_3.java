import java.util.Scanner;
public class Question_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String s = sc.nextLine();
        System.out.println("Enter The Character : ");
        char c = sc.nextLine().charAt(0);
        if(s.indexOf(c) == -1)
            System.out.println("There Are No Occurance Of "+c+" in "+s);
        else
        {
            int count = findRepeat(s,c,s.indexOf(c)+1, 1);
            System.out.println("Occurance Of "+c+" is : "+count);
        }
    }

    static int findRepeat(String s, char c, int index, int count)
    {
        if(s.indexOf(c, index) == -1){
            return count;
        }
        return findRepeat(s,c , s.indexOf(c, index) + 1 , count + 1);
    }


}
