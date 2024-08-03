package day6;

class TestLifeCycle1 implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("Running: "+this.getClass().getName());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("Stopped: "+this.getClass().getName());

	}
}

class TestLifeCycle2 implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(4000);
			System.out.println("Running: "+this.getClass().getName());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("Stopped: "+this.getClass().getName());
	}
}

public class ThreadLifeCycle {
	public static void main(String[] args) {
		Thread th1 = new Thread(new TestLifeCycle1());
		Thread th2 = new Thread(new TestLifeCycle2());

		th1.start();
		th2.start();
	}
}
