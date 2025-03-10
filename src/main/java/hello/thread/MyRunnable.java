package hello.thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        int i;
        for (i = 0; i < 200; i++) {
            System.out.print(Thread.currentThread().getName() + ":" + i + "\t");
        }
    }
}
