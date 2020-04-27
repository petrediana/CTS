package main;

import facade.DashboardFacade;
import prototype.BuildingBlock;
import prototype.StoneBlock;
import prototype.WoodBlock;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Prototype
        StoneBlock block1 = new StoneBlock(0, 0);
        StoneBlock block2 = (StoneBlock)block1.cloneBlock();
        block1.setY(1);

        StoneBlock block3 = (StoneBlock)block2.cloneBlock();
        block3.setX(1);
        block3.setY(0);

        StoneBlock block4 = (StoneBlock)block3.cloneBlock();
        block4.setY(1);

        WoodBlock block5 = new WoodBlock(0, 0, 1);
        WoodBlock block6 = (WoodBlock)block5.cloneBlock();
        block6.setY(1);

        List<BuildingBlock> list = new ArrayList<>();
        list.add(block1);
        // ...
        list.add(block6);

        // Facade
        DashboardFacade facade = new DashboardFacade();
        facade.startCar();
        facade.accelerate();
        facade.turnLeft();
        facade.decelerate();
        facade.startCar();
    }
}
