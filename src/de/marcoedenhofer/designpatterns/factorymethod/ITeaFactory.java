package de.marcoedenhofer.designpatterns.factorymethod;

public interface ITeaFactory {
    ITea createTea(TeaTypes teaType) throws Exception;
}
