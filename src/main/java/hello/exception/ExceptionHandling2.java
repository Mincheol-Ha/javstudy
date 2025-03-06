package hello.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");

        } catch (FileNotFoundException e) {
            System.out.println(e);
           return;
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace(); // 어디에서 예외가 발생했는지 찾아가는 printStackTrace() 메서드 호출
                }
            }System.out.println("항상 수행됩니다.");
        }
        System.out.println("여기서도 실행됩니다");
    }
}
