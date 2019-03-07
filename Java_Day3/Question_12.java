import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Question_12 {

    AtomicInteger count= new AtomicInteger();

    public void incrementCount() {
        synchronized (this) {
            count.incrementAndGet();
        }
    }

    public void worker1() {
        for (int i = 1; i <= 1000; i++) {
            count.incrementAndGet();
        }
    }

    public void worker2() {
        for (int i = 1; i <= 1000; i++) {
            count.incrementAndGet();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Question_12 synchronize = new Question_12();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronize.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronize.worker2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchronize.count);
    }

}
