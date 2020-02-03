package de.marcoedenhofer.designpatterns.factorymethod.greentea;

import de.marcoedenhofer.designpatterns.factorymethod.ITea;

public class Matcha implements ITea {
    @Override
    public String getTeaType() {
        return "Green Tea";
    }

    @Override
    public String getDescription() {
        return "Matcha tea";
    }

    @Override
    public int getBrewingTime() {
        return 2;
    }
}
