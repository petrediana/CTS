package builder;

public class PenthouseBuilder implements AbstractApartmentBuilder {
    private Apartment apartment = new Apartment();

    @Override
    public void setSurface(float surface) {
        apartment.setSurface(surface);
    }

    @Override
    public void setNbOfRooms(int nbOfRooms) {
        apartment.setNbOfRooms(nbOfRooms);
    }

    @Override
    public void setFloor(int floor) {
        apartment.setFloor(floor);
    }

    @Override
    public Apartment getResult() {
        if (apartment.getSurface() > 300 &&
                apartment.getNbOfRooms() > 3 &&
                    apartment.getFloor() > 7) {
            return apartment;
        } else {
            return null;
        }
    }
}
