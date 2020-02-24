package pachet;

public class PolarBear extends Bear{
    private final int POLAR_SPEED = 100;

    public PolarBear() {

    }

    public int getPOLAR_SPEED() {
        return POLAR_SPEED;
    }

    @Override
    public String toString() {
        return "PolarBear{" +
                "POLAR_SPEED=" + POLAR_SPEED +
                '}';
    }
}
