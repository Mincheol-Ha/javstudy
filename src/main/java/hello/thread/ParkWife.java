package hello.thread;

public class ParkWife extends Thread {

    public void run() {
        System.out.println("Start minus");
        SyncMainTest.myBank.minusMoney(1000);
        System.out.println("minusMoney(1000): " + SyncMainTest.myBank.getMoney());
    }
}
