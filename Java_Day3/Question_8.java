import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Question_8 {
    public static void main(String[] args) {

        ExecutorService es = Executors.newSingleThreadScheduledExecutor();
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

        ((ScheduledExecutorService) es).schedule(t1,2, TimeUnit.SECONDS);
        ((ScheduledExecutorService) es).schedule(t2,6,TimeUnit.SECONDS);
        ((ScheduledExecutorService) es).schedule(t3,5,TimeUnit.SECONDS);
        es.shutdown();

    }

}
