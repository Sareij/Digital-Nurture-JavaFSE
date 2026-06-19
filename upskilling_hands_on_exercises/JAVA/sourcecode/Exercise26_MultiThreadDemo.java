/**
 * Exercise 26 - MultiThread Demo
 * Objective:
 * Create and run two threads that print messages.
 */

class MessageThread extends Thread {

    private String message;

    public MessageThread(String message) {

        this.message = message;

    }
    

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(message + " - Count: " + i);

            try {

                Thread.sleep(500);

            } catch (InterruptedException e) {

                System.out.println(e.getMessage());

            }

        }

    }
}

public class Exercise26_MultiThreadDemo {

    public static void main(String[] args) {

        MessageThread thread1 =
                new MessageThread("Thread 1 Running");

        MessageThread thread2 =
                new MessageThread("Thread 2 Running");

        thread1.start();

        thread2.start();

    }
}