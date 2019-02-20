import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Question_10 {
    public static void main(String...args)
    {
        add(5,5);
        add(5.0,6.2);
        multiply(6,5);
        multiply(6f,6f);
        conCat("Hello", "World");
        conCat("Hello","World", "Again");
    }

   static void add(int a, int b){
        System.out.println("Integer Sum : "+(a+b));
    }

    static void add(double a, double b){
        System.out.println("Double Sum : "+(a+b));
    }

    static void multiply(int a, int b){
        System.out.println("Integer Product : "+(a*b));
    }

    static void multiply(float a,float b){
        System.out.println("Float Product : "+(a*b));
    }

    static void conCat(String a, String b){
        System.out.println("Concatination : " +a+b);
    }

    static void conCat(String a, String b, String c){
        System.out.println("Concatination : "+a+b+c);
    }
}
