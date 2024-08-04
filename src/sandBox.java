

class DemoThread extends Thread {
    private char threadChar;
    private int count;

    public DemoThread(char threadChar, int count) {
        this.threadChar = threadChar;
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println(threadChar + " Thread Started");

        for (int i = 1; i <= count; i++) {
            try {
                // Demonstrating Thread.sleep()
                Thread.sleep(500);

                // Demonstrating Thread.yield()
                Thread.yield();

                System.out.println(threadChar + " Count: " + i);
            } catch (InterruptedException e) {
                System.out.println(threadChar + " Thread Interrupted");
                return; // Exit the run method if interrupted
            }
        }

        System.out.println(threadChar + " Thread Stopped");
    }
}

public class sandBox {
    public static void main(String[] args) {
        DemoThread thread1 = new DemoThread('%', 10);
        DemoThread thread2 = new DemoThread('#', 10);

        thread1.start();
        thread2.start();

        try {
            // Demonstrating Thread.sleep()
            Thread.sleep(2000);

            // Interrupting thread1
            thread1.interrupt();

            // Demonstrating Thread.join()
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish

            System.out.println("Both threads have completed execution");
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
    }
}
