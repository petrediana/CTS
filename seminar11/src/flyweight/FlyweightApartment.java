package flyweight;

public class FlyweightApartment implements Renderable{
    private ApartmentType apartmentType;

    public FlyweightApartment(ApartmentType apartmentType) {
        this.apartmentType = apartmentType;
    }

    @Override
    public void render() {
        if (apartmentType == ApartmentType.TwoRooms) {
            System.out.print(" [ ] [ ]   ");
        } else {
            if (apartmentType == ApartmentType.ThreeRooms) {
                System.out.print(" [ ] [ ] [ ]   ");
            }
        }
    }
}
