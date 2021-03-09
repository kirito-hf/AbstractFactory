package FurnitureFactory.Modern;

import FurnitureFactory.AbstractFactory;

public class ModernFactory implements AbstractFactory {
    @Override
    public void createChair() {
        System.out.println("Factory creates Modern Chair");
    }

    @Override
    public void createSofa() {
        System.out.println("Factory creates Modern Sofa");

    }

    @Override
    public void createCoffeeTable() {
        System.out.println("Factory creates Modern CoffeeTable");
    }
}
