package reversegamelevel;

public class Player {
    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    // 레벨 변경 메스드로 현재 자신의 level을 매개변수로 받은 level로 변경하고 레벨 메시지 출력
    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    // PlayerLevel의 템플릿 메서드 go() 호출
    public void play(int count) {
        level.go(count);
    }
}
