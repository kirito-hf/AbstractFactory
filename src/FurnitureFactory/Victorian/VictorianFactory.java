package FurnitureFactory.Victorian;

import FurnitureFactory.AbstractFactory;

public class VictorianFactory implements AbstractFactory {
    @Override
    public void createChair() {
        System.out.println("Factory creates Victorian chair");
    }

    @Override
    public void createSofa() {
        System.out.println("Factory creates Victorian Sofa");
    }

    @Override
    public void createCoffeeTable() {
        System.out.println("Factory creates Victorian CoffeeTable");
    }
}
