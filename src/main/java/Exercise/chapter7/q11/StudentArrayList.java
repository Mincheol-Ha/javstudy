package exercise.chapter7.q11;

import exercise.chapter7.q9.Student;

import java.util.ArrayList;

public class StudentArrayList {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1001, "James"));
        students.add(new Student(1002, "Tomas"));
        students.add(new Student(1003, "Edwards"));

        for(int i = 0; i < students.size(); i++) {
            students.get(i).showStudent();
        }
    }

}
