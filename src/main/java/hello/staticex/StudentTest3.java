package hello.staticex;

public class StudentTest3 {
    public static void main(String[] args) {
        Student1 studentLee = new Student1();
        studentLee.setStudentName("이지원");
        System.out.println(Student1.serialNum);
        System.out.println(studentLee.StudentName + " 학번:" + studentLee.studentID);

        Student1 studentSon = new Student1();
        studentSon.setStudentName("손흥민");
        System.out.println(Student1.serialNum);
        System.out.println(studentSon.StudentName + " 학번:" + studentSon.studentID);
    }



}
