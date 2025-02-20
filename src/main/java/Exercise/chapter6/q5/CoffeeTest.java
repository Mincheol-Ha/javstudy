package Exercise.chapter6.q5;

public class CoffeeTest {

    public static void main(String[] args) {

        Person kim = new Person("kim", 10000);
        BeanCoffee beanCoffee = new BeanCoffee();

        kim.buyBeanCoffee(beanCoffee, Menu.AMERICANO);

    }
}
