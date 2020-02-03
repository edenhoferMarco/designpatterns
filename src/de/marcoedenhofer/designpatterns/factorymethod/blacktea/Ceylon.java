package de.marcoedenhofer.designpatterns.factorymethod.blacktea;

import de.marcoedenhofer.designpatterns.factorymethod.ITea;

public class Ceylon implements ITea {
    @Override
    public String getTeaType() {
        return "Black Tea";
    }

    @Override
    public String getDescription() {
        return "Ceylon tea";
    }

    @Override
    public int getBrewingTime() {
        return 4;
    }
}
