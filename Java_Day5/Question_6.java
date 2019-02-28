interface MyInter{
    default void defaultFunc(){
        System.out.println("Default Function !!");
    }

    static void staticFunc(){
        System.out.println("Static Function !!");
    }
}

public class Question_6 implements MyInter{

    public static void main(String[] args) {

        new Question_6().defaultFunc();

        MyInter.staticFunc();

    }

}
