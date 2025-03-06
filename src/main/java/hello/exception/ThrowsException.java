package hello.exception;

import java.io.FileNotFoundException;

public class ThrowsException { 
    public Class loadClass(String fileName, String className) throws
            FileNotFoundException, ClassNotFoundException {
        FileNotFoundException fis = new FileNotFoundException(fileName);
        Class c = Class.forName(className);
        return c;
    }
 public static void main(String[] args) {
     ThrowsException test = new ThrowsException();
     try {
         test.loadClass("a.txt", "java.lang.String");
     } catch (FileNotFoundException e) {
         throw new RuntimeException(e);
     } catch (ClassNotFoundException e) {
         throw new RuntimeException(e);
     } catch (Exception e) {
         e.printStackTrace();  // Exception 클래스로 그 외 예외 상황 처리
     }
 }
}
