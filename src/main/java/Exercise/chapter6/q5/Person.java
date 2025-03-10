package exercise.chapter6.q5;

public class Person {
    String name;
    int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyBeanCoffee(BeanCoffee bCoffee, int money) {
        String message = bCoffee.brewing(money);
        if (message != null) {
            this.money -= money;
            System.out.println(name + "님의 남은 돈은" + this.money + "웝 입니다." + message);
        }
    }
}
