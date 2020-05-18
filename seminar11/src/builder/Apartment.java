package builder;

public class Apartment {
    private float surface;
    private int nbOfRooms;
    private int floor;

    protected Apartment() {

    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }

    public int getNbOfRooms() {
        return nbOfRooms;
    }

    public void setNbOfRooms(int nbOfRooms) {
        this.nbOfRooms = nbOfRooms;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "surface=" + surface +
                ", nbOfRooms=" + nbOfRooms +
                ", floor=" + floor +
                '}';
    }
}
