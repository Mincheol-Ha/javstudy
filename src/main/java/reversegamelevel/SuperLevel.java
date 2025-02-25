package reversegamelevel;

public class SuperLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("엄첨 빠르게 걸어다닙니다.");
    }

    @Override
    public void jump() {
        System.out.println("엄청 높이 점프를 합니다");

    }

    @Override
    public void turn() {
        System.out.println("한바퀴 턴합니다.");

    }

    @Override
    public void showLevelMessage() {
        System.out.println(" +++ 고급 레벨입니다. +++");

    }
}
