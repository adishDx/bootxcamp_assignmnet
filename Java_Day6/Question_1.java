class Dummy{

    private static Dummy instance = null;
    private String info;

    private Dummy(){

    }


    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public static Dummy getInstance()
    {
        if (instance == null)
            instance = new Dummy();

        return instance;
    }

    @Override
    public String toString() {
        return info;
    }
}


public class Question_1 {

    public static void main(String[] args) {

        Dummy obj = Dummy.getInstance();
        Dummy obj2 = Dummy.getInstance();

        obj.setInfo("Some Info");

        System.out.println(obj);

        obj.setInfo("Some Modified Info");

        System.out.println(obj2);

    }

}
