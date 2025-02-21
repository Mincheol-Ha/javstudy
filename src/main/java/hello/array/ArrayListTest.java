package hello.array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("태백산맥", "조정래"));
        library.add(new Book("데미안", "헤스만 헤세"));
        library.add(new Book("어떻게 살 것인가", "유시민"));
        library.add(new Book("파이썬 프로그래밍", "조인석"));
        library.add(new Book("어쩌다 데이터 분석", "김유지"));

        for (int i = 0; i < library.size(); i++) {
            Book book = library.get(i);
            book.showBookInfo();
        }
        System.out.println();

        System.out.println("=== 향상된 for문 사용 ===");
        for (Book book : library) {
            book.showBookInfo();

        }
    }
}
