package exercise.chapter6.q5;

public class BeanCoffee {
    int money;

    public String brewing(int money) {
        this.money = money;
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
