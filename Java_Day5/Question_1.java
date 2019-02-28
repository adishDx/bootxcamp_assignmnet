interface compare{
    boolean gorl(int a ,int b);
}

interface inc{
    int increment(int a);
}

interface ConCat{
    String Concatinate(String a, String b);
}

interface Convert{
    String UPC(String a);
}

public class Question_1 {

    public static void main(String[] args) {

        compare c = (a,b) -> {
            if (a>b)
                return true;
            else return false;
        };
        System.out.println(c.gorl(10,20));

        inc a = val -> val + 1 ;

        System.out.println(a.increment(5));

        ConCat con = (x,y) -> x+y;
        System.out.println(con.Concatinate("Adish"," Jain"));

        Convert cc = str -> str.toUpperCase();

        System.out.println(cc.UPC("Adish"));
    }
}
