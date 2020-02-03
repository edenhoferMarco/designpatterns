package de.marcoedenhofer.designpatterns.abstractfactory.japaneseteaparty;

import de.marcoedenhofer.designpatterns.abstractfactory.ITeaCups;

public class TeaBowl implements ITeaCups {

    @Override
    public String getDescription() {
        return "A beautiful japanese tea bowl";
    }
}
