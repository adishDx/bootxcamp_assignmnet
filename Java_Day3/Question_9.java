import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Question_9 implements Runnable {

    private int id;
    public Question_9(int id)
    {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread name:: "+Thread.currentThread().getName()+" Start :"+id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread name::"+Thread.currentThread().getName()+" End :"+id);
    }

    public static void main(String[] args) {

        //ExecutorService es = Executors.newCachedThreadPool();
        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            es.submit(new Question_9(i));
        }
        es.shutdown();
    }

}
