package de.marcoedenhofer.designpatterns.abstractfactory;

import de.marcoedenhofer.designpatterns.abstractfactory.englishteaparty.EnglishTeaPartyGenerator;
import de.marcoedenhofer.designpatterns.abstractfactory.japaneseteaparty.JapaneseTeaCeremonyGenerator;
import de.marcoedenhofer.designpatterns.factorymethod.ITea;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        ITeaPartyGenerator japaneseTeaCeremonyGenerator = new JapaneseTeaCeremonyGenerator();
        ITeaPartyGenerator englishTeaPartyGenerator = new EnglishTeaPartyGenerator();

        try {
            ITea japaneseTea = japaneseTeaCeremonyGenerator.createTea();
            ITeaCups japaneseCups = japaneseTeaCeremonyGenerator.createTeaCups();

            ITea englishTea = englishTeaPartyGenerator.createTea();
            ITeaCups englishCups = englishTeaPartyGenerator.createTeaCups();

            printTeaParty("Japanese",japaneseTea,japaneseCups);
            printTeaParty("English",englishTea,englishCups);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printTeaParty(String partyType, ITea tea, ITeaCups teaCups) {
        System.out.println(partyType + "\nTea: " +tea.getDescription() + "\nCups: " + teaCups.getDescription() + "\n");
    }
}
