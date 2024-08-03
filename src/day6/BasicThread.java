package day6;

class MyThread extends Thread {
	public void run() {
		System.out.println("Printing thread: "+this.getName());
	}
}

class MyRunnableThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Printing runnable thread: "+this);
	}
	
}

public class BasicThread {
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		t1.start();
		t2.start();
		
		Thread tr1=new Thread(new MyRunnableThread());
		Thread tr2=new Thread(new MyRunnableThread());
		tr1.start();
		tr2.start();
	}
}
