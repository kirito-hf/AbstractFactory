package FurnitureFactory.Victorian;

import FurnitureFactory.AbstractFactory;
import FurnitureFactory.FactoryManager;
import FurnitureFactory.FurnitureTester;
import FurnitureFactory.ProjectTeamFactory;

public class VicTeamFactory implements ProjectTeamFactory {
    @Override
    public AbstractFactory getFactory() {
        return new VictorianFactory();
    }

    @Override
    public FurnitureTester getTester() {
        return new VicTester();
    }

    @Override
    public FactoryManager getManager() {
        return new VicPM();
    }
}
