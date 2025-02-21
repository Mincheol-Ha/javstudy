package Exercise.chapter7.q9;

public class Student {
    private int studentID;
    private String name;


    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public void showStudent() {
        System.out.println(studentID + "," + name);
    }
}
