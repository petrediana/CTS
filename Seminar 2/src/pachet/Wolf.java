package pachet;

public class Wolf implements Runner {
    private final int WOLF_SPEED = 70;

    public Wolf() {
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "WOLF_SPEED=" + WOLF_SPEED +
                '}';
    }

    @Override
    public int getSpeed() {
        return this.WOLF_SPEED;
    }
}