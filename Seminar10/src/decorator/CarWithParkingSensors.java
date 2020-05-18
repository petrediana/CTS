package decorator;

public class CarWithParkingSensors extends CarDecorator {
    public CarWithParkingSensors(Car car) {
        super(car);
    }

    @Override
    public void start() {
        car.start();
        System.out.println("Parking sensors on");
    }
}
