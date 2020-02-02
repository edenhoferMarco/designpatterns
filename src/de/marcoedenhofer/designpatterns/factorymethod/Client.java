package de.marcoedenhofer.designpatterns.factorymethod;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        ITeaFactory teaFactory = new TeaFactory();
        try {
            ITea greenTea = teaFactory.createTea(TeaTypes.GREEN);
            ITea blackTea = teaFactory.createTea(TeaTypes.BLACK);
            ITea fruitTea = teaFactory.createTea(TeaTypes.FRUIT);
            List<ITea> teas = List.of(greenTea, blackTea, fruitTea);
            teas.forEach(Client::printTeaDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printTeaDetails(ITea tea) {
        System.out.println("Type: " + tea.getTeaType() + "\nDescription: " + tea.getDescription() + "\nBrewing Time: "
                + tea.getBrewingTime() + " minutes\n");
    }
}
