package pachet;

public class Grizzly extends Bear {
    private final int GRIZZLY_SPEED = 90;

    public Grizzly() {
    }

    @Override
    public String toString() {
        return "Grizzly{" +
                "GRIZZLY_SPEED=" + GRIZZLY_SPEED +
                '}';
    }

    @Override
    public int getSpeed() {
        return this.GRIZZLY_SPEED;
    }
}
