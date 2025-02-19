package hello.staticex;

public class Student2 {
    private static int serialNum = 1000; // static 변수는 인스턴스 생성과 상관없이 먼저 생성됨
    int studentID;
    String StudentName;
    int grade;
    String address;

    public Student2() {
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName() {

        return StudentName;
    }

    public void setStudentName(String name) {

        StudentName = name;
    }
    public static int getSerialNum() {
        int i = 10;
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Student2.serialNum = serialNum;
    }
}
