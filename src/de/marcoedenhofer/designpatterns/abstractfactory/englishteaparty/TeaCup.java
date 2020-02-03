package de.marcoedenhofer.designpatterns.abstractfactory.englishteaparty;

import de.marcoedenhofer.designpatterns.abstractfactory.ITeaCups;

public class TeaCup implements ITeaCups {
    @Override
    public String getDescription() {
        return "A clean white teacup";
    }
}
