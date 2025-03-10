package exercise.chapter12.q5;

import java.util.HashSet;

public class StudentTest {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<Student>();
        set.add(new Student("100", "이나연"));
        set.add(new Student("200", "강호동"));
        set.add(new Student("300", "유재석"));
        set.add(new Student("400", "고소영"));
        set.add(new Student("100", "송중기"));

        System.out.println(set);
    }
}
