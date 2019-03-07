import java.util.concurrent.*;

public class Question_6 {

    public static void main(String[] args) {

        ExecutorService es = Executors.newSingleThreadExecutor();
        Callable<Integer> callable = () -> {
            Thread.sleep(5000);
            System.out.println("This Is Callable !!");
            return 5;
        };
        Future<Integer> future = es.submit(callable);
        try {
            System.out.println(future.get());
            System.out.println(future.isCancelled());
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}
