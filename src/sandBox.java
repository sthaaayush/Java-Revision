class MyThread extends Thread {
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(i);
//        }
//    }

//	public void run() {
//		for (int i = 1; i <= 5; i++) {
//			Thread.yield();
//			System.out.println(i);
//		}
//	}
	
//	 public void run() {
//	        try {
//	            for (int i = 1; i <= 5; i++) {
//	                System.out.println(i);
//	                Thread.sleep(1000);
//	            }
//	        } catch (InterruptedException e) {
//	            System.out.println("Thread interrupted");
//	        }
//	    }
	
	public void run() {
        System.out.println("Starting long-running calculation...");
        try {
            for (int i = 0; i < 10; i++) {
                if (Thread.interrupted()) {
                    System.out.println("Calculation interrupted.");
                    return;
                }
                // Simulate long-running calculation with sleep
                Thread.sleep(1000);
                System.out.println("Calculation step " + (i + 1));
            }
        } catch (InterruptedException e) {
            System.out.println("Calculation interrupted during sleep.");
        }
        System.out.println("Calculation complete.");
    }
}

public class sandBox {
	 public static void main(String[] args) {
	        MyThread calculation = new MyThread();
	        calculation.start();
	        // Simulate user interrupting the calculation after 3 seconds
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        calculation.interrupt();
	    }
}
