package FurnitureFactory.Modern;

import FurnitureFactory.AbstractFactory;
import FurnitureFactory.FactoryManager;
import FurnitureFactory.FurnitureTester;
import FurnitureFactory.ProjectTeamFactory;

public class ModernTeamFactory implements ProjectTeamFactory {
    @Override
    public AbstractFactory getFactory() {
        return new ModernFactory();
    }

    @Override
    public FurnitureTester getTester() {
        return new ModernFurTester();
    }

    @Override
    public FactoryManager getManager() {
        return new ModernPM();
    }
}
