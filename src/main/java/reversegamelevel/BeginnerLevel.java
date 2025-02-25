package reversegamelevel;

public class BeginnerLevel extends PlayerLevel {

    @Override
    public void run() {
        System.out.println("천천히 걸어다닙니다.");
    }

    @Override
    public void jump() {
        System.out.println("아직 점프는 배우지 못했습니다.");

    }

    @Override
    public void turn() {
        System.out.println("아직 턴은 배우지 못했습니다.");

    }

    @Override
    public void showLevelMessage() {
        System.out.println(" +++ 초급 레벨입니다. +++");

    }
}
