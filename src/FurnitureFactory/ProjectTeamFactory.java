package FurnitureFactory;

public interface ProjectTeamFactory {
    AbstractFactory getFactory();

    FurnitureTester getTester();

    FactoryManager getManager();

}
