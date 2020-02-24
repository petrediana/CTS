package pachet;

public class PolarBear extends Bear{
    private final int POLAR_SPEED = 100;

    public PolarBear() {

    }

    @Override
    public String toString() {
        return "PolarBear{" +
                "POLAR_SPEED=" + POLAR_SPEED +
                '}';
    }

    @Override
    public int getSpeed() {
        return this.POLAR_SPEED;
    }
}
