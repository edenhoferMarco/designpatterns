package de.marcoedenhofer.designpatterns.abstractfactory.japaneseteaparty;

import de.marcoedenhofer.designpatterns.abstractfactory.ITeaCups;
import de.marcoedenhofer.designpatterns.abstractfactory.ITeaPartyGenerator;
import de.marcoedenhofer.designpatterns.factorymethod.ITea;
import de.marcoedenhofer.designpatterns.factorymethod.ITeaFactory;
import de.marcoedenhofer.designpatterns.factorymethod.TeaTypes;
import de.marcoedenhofer.designpatterns.factorymethod.greentea.GreenTeaFactory;

public class JapaneseTeaCeremonyGenerator implements ITeaPartyGenerator {
    // this is supposed to show, that a nested Factory Method Pattern is possible in the Abstract Factory Pattern.
    private ITeaFactory teaFactory = new GreenTeaFactory();

    @Override
    public ITea createTea() throws Exception {
        return teaFactory.createTea(TeaTypes.EXPENSIVE);
    }

    @Override
    public ITeaCups createTeaCups() {
        return new TeaBowl();
    }
}
