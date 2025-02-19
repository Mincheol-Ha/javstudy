package hello.staticex;

public class Student1 {
    public static int serialNum = 1000; // static 변수는 인스턴스 생성과 상관없이 먼저 생성됨
    public int studentID;
    public String StudentName;
    public int grade;
    public String address;

    public Student1() {
        serialNum++;
        studentID = serialNum;
    }


    public String getStudentName() {

        return StudentName;
    }

    public void setStudentName(String name) {

        StudentName = name;
    }
}
