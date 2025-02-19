package hello.cooperation;

public class Student {
    public String studentName;
    public int garde;
    public int money;

    public Student(String studentName, int money) {
        this.money = money;
        this.studentName = studentName;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1500);
        this.money -= 1500;
    }

    public void showInfo() {
        System.out.println(studentName + " 님의 남은 돈은 " + money + "입니다.");
    }
}

