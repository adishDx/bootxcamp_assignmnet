import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Question_3 {

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
        Future<?> h =  es.submit(t2);
        es.submit(t3);

        es.shutdown();

//        List<Runnable> rest = es.shutdownNow();
//        System.out.println(rest);

    }

}
