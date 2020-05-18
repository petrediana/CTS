package Main;

import Proxy.Client;
import Proxy.Credit;
import Proxy.CreditPrimaCasa;
import Proxy.Proxy;
import builder.Apartment;
import builder.ApartmentDirector;
import builder.PenthouseBuilder;
import flyweight.ApartmentType;
import flyweight.FlyweightApartmentFactory;
import flyweight.Renderable;

public class Main {
    public static void main(String[] args) {
        // Builder
        ApartmentDirector director = new ApartmentDirector(new PenthouseBuilder());
        Apartment ap1 = director.construct(200, 3, 5);
        System.out.println(ap1);

        Apartment ap2 = director.construct(400, 4, 10);
        System.out.println(ap2);

        // Flyweight
        FlyweightApartmentFactory factory = new FlyweightApartmentFactory();
        for (int i = 0; i < 5; ++i) {
            Renderable r1 = factory.getObject(ApartmentType.TwoRooms);
            Renderable r2 = factory.getObject(ApartmentType.ThreeRooms);
            Renderable r3 = factory.getObject(ApartmentType.TwoRooms);
            Renderable r4 = factory.getObject(ApartmentType.ThreeRooms);

            r1.render();
            r2.render();
            r3.render();
            r4.render();
            System.out.println();
        }

        // Proxy
        Client client = new Client("Ion Ion", 3000);
        Credit credit = new Proxy(new CreditPrimaCasa(client.getIncome()), client);
        System.out.println(client);
        System.out.println(credit.approved());

        Client client2 = new Client("John John", 6500);
        Credit credi2 = new Proxy(new CreditPrimaCasa(client2.getIncome()), client2);
        System.out.println(client2);
        System.out.println(credi2.approved());

    }
}
