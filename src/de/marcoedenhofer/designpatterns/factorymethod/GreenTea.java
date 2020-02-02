package de.marcoedenhofer.designpatterns.factorymethod;

public class GreenTea implements ITea {
    @Override
    public String getTeaType() {
        return "Green Tea";
    }

    @Override
    public String getDescription() {
        return "Green tea, harvested in Japan";
    }

    @Override
    public int getBrewingTime() {
        return 2;
    }
}
