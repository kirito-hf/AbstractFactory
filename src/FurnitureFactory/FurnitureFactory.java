package FurnitureFactory;

import FurnitureFactory.ArtDeco.ArtDecoFactory;
import FurnitureFactory.ArtDeco.ArtDecoTeam;
import FurnitureFactory.Modern.ModernFactory;
import FurnitureFactory.Modern.ModernTeamFactory;
import FurnitureFactory.Victorian.VicTeamFactory;

public class FurnitureFactory {

    public static void main(String[] args) {

        ProjectTeamFactory projectTeamFactory = new ArtDecoTeam();

        AbstractFactory abstractFactory = projectTeamFactory.getFactory();

        FurnitureTester furnitureTester = projectTeamFactory.getTester();

        FactoryManager factoryManager = projectTeamFactory.getManager();

        System.out.println("Factory is creating Art Deco furnitures");

        abstractFactory.createChair(); abstractFactory.createSofa(); abstractFactory.createCoffeeTable();

        furnitureTester.testfurniture();

        factoryManager.manageProject();
        //////////////////////////////

        ProjectTeamFactory projectTeamFactory1 = new ModernTeamFactory();

        AbstractFactory abstractFactory1 = projectTeamFactory1.getFactory();

        FurnitureTester furnitureTester1 = projectTeamFactory1.getTester();

        FactoryManager factoryManager1 = projectTeamFactory1.getManager();

        System.out.println("Factory is creating Modern furnitures");

        abstractFactory1.createCoffeeTable(); abstractFactory1.createSofa(); abstractFactory1.createChair();

        furnitureTester1.testfurniture(); factoryManager1.manageProject();

        ////////////////////////////



        ProjectTeamFactory projectTeamFactory2 = new VicTeamFactory();

        AbstractFactory abstractFactory2 = projectTeamFactory2.getFactory();

        FurnitureTester furnitureTester2 = projectTeamFactory2.getTester();

        FactoryManager factoryManager2 = projectTeamFactory2.getManager();

        System.out.println("Factory is creating Victorian themed furnitures");

        abstractFactory2.createChair(); abstractFactory2.createSofa(); abstractFactory2.createCoffeeTable();

        furnitureTester2.testfurniture(); factoryManager2.manageProject();








    }
}
