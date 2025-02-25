package Exercise.chapter9.q7;

public class CarTest {
    public static void main(String[] args) {
        Bus bus = new Bus();
        AutoCar autoCar = new AutoCar();

        bus.run();
        autoCar.run();

        bus.refuel();
        autoCar.refuel();

        bus.takePassenger();
        autoCar.takePassenger();

        bus.stop();
        autoCar.stop();
    }
}
