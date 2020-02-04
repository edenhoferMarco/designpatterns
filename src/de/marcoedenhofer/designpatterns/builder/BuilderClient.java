package de.marcoedenhofer.designpatterns.builder;

import de.marcoedenhofer.designpatterns.builder.teaflavorbuilder.GreenTeaFlavour;
import de.marcoedenhofer.designpatterns.builder.teaflavorbuilder.GreenTeaFlavourBuilder;

import java.util.List;

public class BuilderClient {
    public static void main(String[] args) {
        GreenTeaFlavourBuilder greenTeaBuilder = new GreenTeaFlavourBuilder();

        GreenTeaFlavour greenTeaWithJasmineAndRaspberry =
                greenTeaBuilder.withJasmine()
                .withRaspberry()
                .create();
        GreenTeaFlavour greenTeaWithJasmine = greenTeaBuilder.withJasmine().create();
        GreenTeaFlavour greenTeaWithRaspberry = greenTeaBuilder.withRaspberry().create();
        GreenTeaFlavour boringGreenTea = greenTeaBuilder.create();

        List<GreenTeaFlavour> teas = List.of(greenTeaWithJasmineAndRaspberry,
                greenTeaWithJasmine, greenTeaWithRaspberry, boringGreenTea);
        teas.forEach(tea -> System.out.println(tea.getDescription()));
    }
}
