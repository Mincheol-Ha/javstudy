package exercise.chapter11.q7;

public class MyDateTest {

    public static void main(String[] args) {

        MyDate date1 = new MyDate(9, 18, 2004);
        MyDate date2 = new MyDate(9, 18, 2004);

        System.out.println(date1.equals(date2));

        System.out.println(date1.hashCode());
        System.out.println(date2.hashCode());
    }
    
}
