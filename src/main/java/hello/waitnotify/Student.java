package hello.waitnotify;

public class Student extends Thread {

    public void run() {
        try {
            String title = LibraryMain.library.lendBook();
            Thread.sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
