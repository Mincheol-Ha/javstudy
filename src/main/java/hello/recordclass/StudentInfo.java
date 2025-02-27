package hello.recordclass;

import java.util.Objects;

public record StudentInfo(int id, String name) {
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StudentInfo std) {
            return this.id == std.id;
        }
        else return false;
    }

    public static void main(String[] args) {

        StudentInfo studentInfo = new StudentInfo(12345, "이나연");
        StudentInfo studentInfo2 = new StudentInfo(12345, "이나연");

        System.out.println(studentInfo.equals(studentInfo2));
        System.out.println(studentInfo.name());
        System.out.println(studentInfo);
        System.out.println(studentInfo2);


    }
}
