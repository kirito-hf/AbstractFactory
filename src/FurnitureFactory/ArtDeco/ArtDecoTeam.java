package FurnitureFactory.ArtDeco;

import FurnitureFactory.AbstractFactory;
import FurnitureFactory.FactoryManager;
import FurnitureFactory.FurnitureTester;
import FurnitureFactory.ProjectTeamFactory;

public class ArtDecoTeam implements ProjectTeamFactory {
    @Override
    public AbstractFactory getFactory() {
        return new ArtDecoFactory();
    }

    @Override
    public FurnitureTester getTester() {
        return new FurTester();
    }

    @Override
    public FactoryManager getManager() {
        return new ArtDecoPM();
    }
}
