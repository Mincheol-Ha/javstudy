package hello.stream;

import java.util.ArrayList;
import java.util.List;

public class DistinctTest {
    public static void main(String[] args) {
        Student studentLee = new Student(200, "이나연");
        Student studentKim = new Student(100, "김도희");
        Student studentKim2 = new Student(100, "김도희");

        List<Student> studentList = new ArrayList<>();
        studentList.add(studentLee);
        studentList.add(studentKim);
        studentList.add(studentKim2);

        studentList.stream()
                //.map(Student::getName) // map() 연산 으로 조건에 맞는 요소를 찾고 그 중에서 동일한 이름을 제외하고 출력
                .distinct()
                .forEach(s -> System.out.println(s.getName()));
    }
}
