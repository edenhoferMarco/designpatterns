package de.marcoedenhofer.designpatterns.factorymethod.greentea;

import de.marcoedenhofer.designpatterns.factorymethod.ITea;

public class Sencha implements ITea {
    @Override
    public String getTeaType() {
        return "Green Tea";
    }

    @Override
    public String getDescription() {
        return "Sencha tea";
    }

    @Override
    public int getBrewingTime() {
        return 2;
    }
}
