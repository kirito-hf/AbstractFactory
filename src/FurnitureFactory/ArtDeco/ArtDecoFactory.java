package FurnitureFactory.ArtDeco;

import FurnitureFactory.AbstractFactory;

public class ArtDecoFactory implements AbstractFactory {
    @Override
    public void createChair() {
        System.out.println("Factory creates ArtDeco Chair");
    }

    @Override
    public void createSofa() {
        System.out.println("Factory creates ArtDeco Sofa");

    }

    @Override
    public void createCoffeeTable() {
        System.out.println("Factory creates ArtDeco CoffeeTable");
    }
}
