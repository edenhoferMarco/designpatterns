package de.marcoedenhofer.designpatterns.factorymethod;

public class TeaFactory implements ITeaFactory {
    @Override
    public ITea createTea(TeaTypes teaType) throws Exception {
        switch(teaType) {
            case BLACK:
                return new BlackTea();
            case GREEN:
                return new GreenTea();
            case FRUIT:
                return new FruitTea();
            default:
                throw new Exception("Tea Type: " + teaType + " is not supported by this factory");
        }
    }
}
