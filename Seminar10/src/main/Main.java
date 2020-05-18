package main;

import composite.File;
import composite.Folder;
import decorator.Car;
import decorator.CarWithAlarm;
import decorator.DaciaLogan;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Decorator
        List<Car> cars = new ArrayList<>();
        cars.add(new DaciaLogan());
        CarWithAlarm carWithAlarm = new CarWithAlarm(new DaciaLogan());
        carWithAlarm.activateAlarm();
        System.out.println(carWithAlarm.isAlarmOn());
        cars.add(carWithAlarm);

        for (Car car : cars) {
            car.start();
        }

        System.out.println(carWithAlarm.isAlarmOn());

        // Composite
        Folder folder4 = new Folder("folder4");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        Folder folder3 = new Folder("folder3");
        folder3.addElement(folder4);
        folder3.addElement(file2);
        folder3.addElement(file3);

        Folder folder2 = new Folder("folder2");
        File file1 = new File("file1.txt");

        Folder folder1 = new Folder("folder1");
        folder1.addElement(file1);
        folder1.addElement(folder2);
        folder1.addElement(folder3);

        folder1.print();

    }
}
