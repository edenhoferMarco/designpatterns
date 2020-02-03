package de.marcoedenhofer.designpatterns.factorymethod;

import de.marcoedenhofer.designpatterns.factorymethod.blacktea.BlackTeaFactory;
import de.marcoedenhofer.designpatterns.factorymethod.greentea.GreenTeaFactory;

import java.util.List;

public class FactoryMethodClient {
    public static void main(String[] args) {
        ITeaFactory greenTeaFactory = new GreenTeaFactory();
        ITeaFactory blackTeaFactory = new BlackTeaFactory();
        try {
            ITea normalGreenTea = greenTeaFactory.createTea(TeaTypes.NORMAL);
            ITea expensiveGreenTea = greenTeaFactory.createTea(TeaTypes.EXPENSIVE);

            ITea normalBlackTea = blackTeaFactory.createTea(TeaTypes.NORMAL);
            ITea expensiveBlackTea = blackTeaFactory.createTea(TeaTypes.EXPENSIVE);

            List<ITea> teas = List.of(normalGreenTea, expensiveGreenTea, normalBlackTea, expensiveBlackTea);
            teas.forEach(FactoryMethodClient::printTeaDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printTeaDetails(ITea tea) {
        System.out.println("Type: " + tea.getTeaType() + "\nDescription: " + tea.getDescription() + "\nBrewing Time: "
                + tea.getBrewingTime() + " minutes\n");
    }
}
