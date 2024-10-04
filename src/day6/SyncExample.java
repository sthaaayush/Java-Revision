package day6;

class SynchronizedCounter {
    private int count = 0;

    // Synchronized method
    public synchronized void increment() {
        count++;
        // Simulate long-running task
        try {
            Thread.sleep(200);  // Simulate a delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public int getCount() {
        return count;
    }
}

public class SyncExample {
    public static void main(String[] args) throws InterruptedException {
        SynchronizedCounter counter = new SynchronizedCounter();

        // Thread that increments the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; ++i) {
                counter.increment();
                System.out.println("= Thread 1: Count = " + counter.getCount());
            }
        });

        // Thread that also increments the counter
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; ++i) {
                counter.increment();
                System.out.println("|| Thread 2: Count = " + counter.getCount());
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Final Count (synchronized): " + counter.getCount());
    }
}
