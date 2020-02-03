package de.marcoedenhofer.designpatterns.factorymethod.greentea;

import de.marcoedenhofer.designpatterns.factorymethod.ITea;
import de.marcoedenhofer.designpatterns.factorymethod.ITeaFactory;
import de.marcoedenhofer.designpatterns.factorymethod.TeaTypes;

public class GreenTeaFactory implements ITeaFactory {
    @Override
    public ITea createTea(TeaTypes teaType) throws Exception {
        switch(teaType) {
            case EXPENSIVE:
                return new Matcha();
            case NORMAL:
                return new Sencha();
            default:
                throw new Exception("Tea Type: " + teaType + " is not supported by this factory");
        }
    }
}
