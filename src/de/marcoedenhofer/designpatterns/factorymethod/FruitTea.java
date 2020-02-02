package de.marcoedenhofer.designpatterns.factorymethod;

public class FruitTea implements ITea {
    @Override
    public String getTeaType() {
        return "Fruit Tea";
    }

    @Override
    public String getDescription() {
        return "Fruity tea combination made of hibiskus and raspberry";
    }

    @Override
    public int getBrewingTime() {
        return 8;
    }
}
