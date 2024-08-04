package day6;

class Count extends Thread {
	private char pal;

	public Count(char pal) {
		this.pal = pal;
	}

	@Override
	public void run() {
		System.out.println(pal + "Counting Started:");
		try {
			for (int i = 1; i <= 10; i++) {
				Thread.sleep(1000);
				Thread.yield();
				System.out.println(pal + " Count: " + i);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread Intrupped: " + pal);
		}
		System.out.println(pal + "Counting Stopped:");
	}
}

public class ThreadMethods {
	public static void main(String[] args) {
		Count count1 = new Count('%');
		Count count2 = new Count('#');

		count1.start();

		try {
			Thread.sleep(3000);
			count2.start();
			count1.join();
			count2.interrupt();
		} catch (Exception e) {
			System.out.print("Error occured: " + e.getMessage());
		}

	}
}
