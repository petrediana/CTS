package decorator;

public class CarWithAlarm extends CarDecorator {
    private boolean isAlarmOn;

    public CarWithAlarm(Car car) {
        super(car);
    }

    @Override
    public void start() {
        car.start();
        deactivateAlarm();
    }

    public void activateAlarm() {
        this.isAlarmOn = true;
    }

    public void deactivateAlarm() {
        this.isAlarmOn = false;
    }

    public boolean isAlarmOn() {
        return isAlarmOn;
    }

    public void setAlarmOn(boolean alarmOn) {
        isAlarmOn = alarmOn;
    }


}
