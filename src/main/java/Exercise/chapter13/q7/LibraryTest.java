package Exercise.chapter13.q7;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("자바", 25000));
        bookList.add(new Book("파이썬", 15000));
        bookList.add(new Book("스피링", 35000));

        // 모든 책의 가격의 함
        int totalPrice = bookList.stream().mapToInt((b -> b.getPrice())).sum();
        System.out.println("모든 책 가격의 합은 " + totalPrice + "원 입니다.");
        bookList.stream().filter(b->b.getPrice() >= 20000).map(b -> b.getName()).sorted().forEach(s -> System.out.println(s));


    }

}

