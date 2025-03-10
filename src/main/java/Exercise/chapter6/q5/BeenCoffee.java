package exercise.chapter6.q5;

public class BeenCoffee {
    /* 아침 출금길에 김 씨는 4,000원을 내고 아메리카노를 사 마셨습니다. 이 씨는 4,500원을 내고
    * 라테를 사 마셨습니다. 이 과정을 객체지향으로 프로그래밍 해 보세요*/

    int money;
    public String brewing(int money) {
        this.money += money;
        if(money == Menu.AMERICANO) {
            return "아메리카노를 구입했습니다.";
        }
        else if(money == Menu.LATTE) {
            return "라떼를 구입했습니다.";
        }
        else {
            return null;
        }
    }
}
