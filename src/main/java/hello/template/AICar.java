package hello.template;

public class AICar extends Car {
    @Override
    public void drive() {
        System.out.println("자율 주행합니다.");
        System.out.println("자동자가 알아서 방향을 전환합니다.");
    }

    @Override
    public void stop() {
        System.out.println("스스로 멈춘니다");
    }
}
