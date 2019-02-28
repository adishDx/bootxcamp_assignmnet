interface I1{
    default void display(){
        System.out.println("Display in I1");
    }
}

interface I2 extends I1{

    default void display(){
        System.out.println("Display in I2");
    }

}

interface I3 extends I1{

    default void display(){
        System.out.println("Display in I3");
    }

}


public class Question_8 implements I1,I2,I3 {

    public void display(){
        System.out.println("Multiple Inheritance Using Interfaces !! ");
    }

    public static void main(String[] args) {

        new Question_8().display();

    }

}
