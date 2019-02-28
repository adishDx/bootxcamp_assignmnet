
@FunctionalInterface
interface fake23{
    int fakemethod(int a, int b);
}

public class Question_3 {

    static int add(int a,int b){
        return a+b;
    }

    static int sub(int a,int b){
        return a-b;
    }

    static int mul(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {

        fake addd = Prac::add;
        fake subb = Prac::sub;
        fake mull = Prac::mul;

        System.out.println(addd.fakemethod(10,30));
        System.out.println(subb.fakemethod(10,30));
        System.out.println(mull.fakemethod(10,30));

    }

}
