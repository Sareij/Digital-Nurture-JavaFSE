import java.util.concurrent.atomic.AtomicInteger;

public class Exercise40_VirtualThreadsDemo {

    // counter for completed tasks
    static AtomicInteger counter = new AtomicInteger(0);

    // task
    public static Runnable task = () -> {
        counter.incrementAndGet();
    };

    public static void main(String[] args) throws Exception {

        int THREADS = 100000;

        // ================= VIRTUAL THREADS =================
        long startVirtual = System.currentTimeMillis();

        for (int i = 0; i < THREADS; i++) {
            Thread.startVirtualThread(task);
        }

        while (counter.get() < THREADS) {
            Thread.sleep(10);
        }

        long endVirtual = System.currentTimeMillis();

        System.out.println("Virtual Threads Time: " +
                (endVirtual - startVirtual) + " ms");

        // reset counter
        counter.set(0);

        // ================= PLATFORM THREADS =================
        long startPlatform = System.currentTimeMillis();

        for (int i = 0; i < THREADS; i++) {
            Thread t = new Thread(task);
            t.start();
        }

        while (counter.get() < THREADS) {
            Thread.sleep(10);
        }

        long endPlatform = System.currentTimeMillis();

        System.out.println("Platform Threads Time: " +
                (endPlatform - startPlatform) + " ms");
    }
}