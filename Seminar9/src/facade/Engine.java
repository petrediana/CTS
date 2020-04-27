package facade;

public class Engine {
    boolean isInServiceModel = false;

    public void startEngine() {
        System.out.println("Engine started...");
    }

    public void stopEngine() {
        System.out.println("Engine stopped...");
    }

    public void increaseRpm() {
        System.out.println("Vrrm...");
    }

    public void activateServiceMode() {
        isInServiceModel = true;
    }


}
