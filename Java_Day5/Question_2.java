@FunctionalInterface
interface fake{
    int fakemethod(int a, int b);
}

public class Question_2 {

    static int fakePrac(int a, int b){
        return a;
    }


    public static void main(String[] args) {
        fake f = Prac::fakePrac;
        System.out.println(f.fakemethod(10,1500));


    }

}
