package hello;

public class InterruptTest extends Thread {
    public void run() {
        try {
            int i;

            for (i=0; i <10; i++) {
                Thread.sleep(3000);
                System.out.print(i + "\t");
            }
        } catch (InterruptedException e) {
            System.out.println("Wake up");
        }
        System.out.println("end");
    }

    public static void main(String[] args) throws InterruptedException {
        InterruptTest test = new InterruptTest();

        test.start();
        Thread.sleep(3000);
        test.interrupt();
    }
}
