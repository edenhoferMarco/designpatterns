package de.marcoedenhofer.designpatterns.factorymethod;

public class BlackTea implements ITea {
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
