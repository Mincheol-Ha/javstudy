package hello.waitnotify;

import java.util.ArrayList;

public class Library {
    private ArrayList<String> shelf = new ArrayList<>();

    public Library() {
        shelf.add("태백산맥 1");
        shelf.add("태백산맥 2");
        shelf.add("태백산맥 3");
/*        shelf.add("태백산맥 4");
        shelf.add("태백산맥 5");
        shelf.add("태백산맥 6");
        shelf.add("태백산맥 7");*/
    }

    public synchronized String lendBook() throws InterruptedException {
        Thread t = Thread.currentThread();
        while(shelf.size() == 0) {
            System.out.println(t.getName() + " waiting start");
            wait();
            System.out.println(t.getName() + " waiting end");
        }
        String book = shelf.remove(0);
        System.out.println(t.getName() + ":" + book + " lend");
        return book;
    }

    public synchronized void returnBook(String book) {
        Thread t = Thread.currentThread();
        shelf.add(book);
        notifyAll();
        System.out.println(t.getName() + ":" + book + " return");
    }
}
