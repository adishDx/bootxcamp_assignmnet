public class Question_2 implements Runnable{

    public static void main(String[] args) {
//
//        new Thread(()->{
//            try {
//                Thread.sleep(5000);
//                System.out.println("Hey There 1");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }).start();

       Thread t1 = new Thread(new Question_2());
       t1.start();

       Thread t2 = new Thread(new Question_2());
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hey There");
    }
}
