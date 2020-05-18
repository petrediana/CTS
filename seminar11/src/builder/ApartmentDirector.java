package builder;

public class ApartmentDirector {
    private AbstractApartmentBuilder builder;

    public ApartmentDirector(AbstractApartmentBuilder builder) {
        this.builder = builder;
    }

    public Apartment construct(float surface, int nbOfRooms, int floor) {
        builder.setFloor(floor);
        builder.setNbOfRooms(nbOfRooms);
        builder.setSurface(surface);
        return builder.getResult();
    }
}
