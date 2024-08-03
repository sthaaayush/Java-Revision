public class sandBox {
    public static void main(String[] args) {
        System.out.println("Task started");

        try {
            // Pause execution for 3 seconds
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Task finished after delay");
    }
}
