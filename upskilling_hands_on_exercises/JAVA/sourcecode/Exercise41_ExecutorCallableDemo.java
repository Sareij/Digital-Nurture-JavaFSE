import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exercise41_ExecutorCallableDemo {

    // Callable task
    static class Task implements Callable<Integer> {
        private int num;

        Task(int num) {
            this.num = num;
        }

        @Override
        public Integer call() {
            int result = num * num;
            System.out.println("Processing: " + num + " by " +
                    Thread.currentThread().getName());
            return result;
        }
    }

    public static void main(String[] args) {

        // 1. Create thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // 2. Submit tasks
        Future<Integer> f1 = executor.submit(new Task(5));
        Future<Integer> f2 = executor.submit(new Task(10));
        Future<Integer> f3 = executor.submit(new Task(15));

        try {
            // 3. Get results
            System.out.println("Result 1: " + f1.get());
            System.out.println("Result 2: " + f2.get());
            System.out.println("Result 3: " + f3.get());

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // 4. Shutdown executor
        executor.shutdown();
    }
}