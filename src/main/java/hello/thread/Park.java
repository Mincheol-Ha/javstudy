package hello.thread;

public class Park extends Thread {

    public void run() {
        System.out.println("Start Save");
        SyncMainTest.myBank.saveMoney(5000);
        System.out.println("saveMoney(5000): " + SyncMainTest.myBank.getMoney());
    }
}
