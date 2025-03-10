package exercise.chapter9.q5;

public abstract class Car {

    public abstract void start();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnoff();

    public void wasCar() {
        System.out.println("세차를 합니다.");
    }

    public void run () {
        start();
        drive();
        turnoff();
        stop();
        wasCar();
    }
}
