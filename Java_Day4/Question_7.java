import java.util.Scanner;
import java.util.Stack;

public class Question_7 extends Stack {

        int min;
        int temp = 0;

    void setMin(int min)
    {
        this.min = min;
    }
    int getMin()
    {
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        Question_7 stack = new Question_7();
        System.out.println("Select the Options : ");
        do {
            System.out.println("Press 1 to push item ");
            System.out.println("Press 2 to Pop Item ");
            System.out.println("Press 3 to get Minimum Elements ");
            System.out.println("Press 4 to Exit !!");
            ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter Element To Push");
                    int n = sc.nextInt();
                    stack.push(n);
                    if(stack.temp == 0) {
                            stack.setMin(n);
                            stack.temp = 1;
                    }
                    else {
                        if (stack.getMin() > n) {
                            stack.setMin(n);
                            System.out.println(stack.getMin());
                        }
                    }
                    break;
                case 2:
                    if (stack.temp == 0)
                        System.out.println("Stack Is Empty \n\n");
                    else
                        System.out.println("Popped Item : "+stack.pop()+"\n\n");
                    break;
                case 3:
                    if (stack.temp == 0)
                        System.out.println("Stack Is Empty \n\n");
                    else
                        System.out.println("Minimum Element : "+stack.getMin()+"\n\n");
                    break;
                case 4:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Enter Correct Choice !!");
            }
        }while(ch != 4);



    }
}
