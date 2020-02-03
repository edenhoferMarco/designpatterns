package de.marcoedenhofer.designpatterns.factorymethod.blacktea;

import de.marcoedenhofer.designpatterns.factorymethod.ITea;

public class Darjeeling implements ITea {
    @Override
    public String getTeaType() {
        return "Black Tea";
    }

    @Override
    public String getDescription() {
        return "Darjeeling second flush";
    }

    @Override
    public int getBrewingTime() {
        return 4;
    }
}
