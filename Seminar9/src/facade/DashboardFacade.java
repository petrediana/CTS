package facade;

public class DashboardFacade {
    private Engine engine = new Engine();
    private CoolingSystem coolingSystem = new CoolingSystem();
    private BrakingSystem brakingSystem = new BrakingSystem();
    private SteeringSystem steeringSystem = new SteeringSystem();

    public void startCar() {
        engine.startEngine();
        coolingSystem.startCoolingSystem();
    }

    public void stopCar() {
        engine.stopEngine();
    }

    public void accelerate() {
        engine.increaseRpm();
    }

    public void decelerate() {
        brakingSystem.applyBreaks();
    }

    public void turnLeft() {
        steeringSystem.steerLeft();
    }

    public void turnRight() {
        steeringSystem.steerRight();
    }
}
