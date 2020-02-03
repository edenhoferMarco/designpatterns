package de.marcoedenhofer.designpatterns.factorymethod.blacktea;

import de.marcoedenhofer.designpatterns.factorymethod.ITea;
import de.marcoedenhofer.designpatterns.factorymethod.ITeaFactory;
import de.marcoedenhofer.designpatterns.factorymethod.TeaTypes;

public class BlackTeaFactory implements ITeaFactory {
    @Override
    public ITea createTea(TeaTypes teaType) throws Exception {
        switch(teaType) {
            case EXPENSIVE:
                return new Darjeeling();
            case NORMAL:
                return new Ceylon();
            default:
                throw new Exception("Tea Type: " + teaType + " is not supported by this factory");
        }
    }
}
