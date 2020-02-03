package de.marcoedenhofer.designpatterns.abstractfactory;

import de.marcoedenhofer.designpatterns.factorymethod.ITea;

public interface ITeaPartyGenerator {
    ITea createTea() throws Exception;
    ITeaCups createTeaCups();
}
