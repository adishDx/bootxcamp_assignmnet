class ThroughExtends extends Thread
{
    @Override
    public void run() {
        System.out.println("Through Extended Class");
    }
}


public class Question_1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Through Runnable");
    }

    public static void main(String[] args) {
        new Thread(new Question_1()).start();
        //for (int i = 0; i < 10000000; i++);
        System.out.println("helloooo");

        new ThroughExtends().start();

    }
}
