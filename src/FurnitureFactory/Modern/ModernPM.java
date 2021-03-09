package FurnitureFactory.Modern;

import FurnitureFactory.FactoryManager;

public class ModernPM implements FactoryManager {
    @Override
    public void manageProject() {
        System.out.println("ModernPM manages factory project");
    }
}
