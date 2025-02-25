package reversegamelevel;

public class AdvanceLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("빠르게 걸어다닙니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프를 합니다");

    }

    @Override
    public void turn() {
        System.out.println("아직 턴은 배우지 못했습니다.");

    }

    @Override
    public void showLevelMessage() {
        System.out.println(" +++ 중급 레벨입니다. +++");

    }
}
