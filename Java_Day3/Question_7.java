import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Question_7 {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println("Thread 1");
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2");
        });

        Thread t3 = new Thread(() -> {
            System.out.println("Thread 3");
        });

        ExecutorService es = Executors.newSingleThreadExecutor();
        es.submit(t1);
        es.submit(t2);
        es.submit(t3);

        es.shutdown();
        try {
            es.awaitTermination(6000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (es.isTerminated())
            System.out.println("Terminated");
        else
            System.out.println("More Task Are Remaining");

    }

}
