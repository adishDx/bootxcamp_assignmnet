interface NewInter
{
    default void defaultFunc(){
        System.out.println("Default Function !!");
    }
}

public class Question_7 implements NewInter {

    public void defaultFunc(){
        System.out.println("Overidden Default !!");
    }

    public static void main(String[] args) {

        new Question_7().defaultFunc();

    }
}
