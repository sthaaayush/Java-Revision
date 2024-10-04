package day6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockCounter {
    private int count = 0;
    private Lock lock = new ReentrantLock();

    // Method to increment the count with try-lock behavior
    public void increment() {
        try {
            if (lock.tryLock()) {  // Attempt to acquire the lock without blocking
                try {
                    count++;
                    System.out.println(Thread.currentThread().getName()+" :Incrementing");
                    // Simulate long-running task
                    Thread.sleep(200);  // Simulate a delay
                } finally {
                    lock.unlock();  // Always release the lock
                }
            } else {
                System.out.println(Thread.currentThread().getName() + ": Lock not acquired, doing other work");
                Thread.sleep(200);  // Adding a small delay before retrying
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public int getCount() {
        return count;
    }
}

public class LockExample {
    public static void main(String[] args) throws InterruptedException {
        LockCounter counter = new LockCounter();

        // Thread that increments the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
                System.out.println("Thread 1: Count = " + counter.getCount());
            }
        }, "Thread 1");

        // Thread that also increments the counter
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                counter.increment();
                System.out.println("Thread 2: Count = " + counter.getCount());
            }
        }, "Thread 2");

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Final Count (ReentrantLock): " + counter.getCount());
    }
}
