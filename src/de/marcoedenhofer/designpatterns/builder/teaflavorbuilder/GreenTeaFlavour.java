package de.marcoedenhofer.designpatterns.builder.teaflavorbuilder;

public class GreenTeaFlavour {
    private boolean withJasmine;
    private boolean withRaspberry;

    GreenTeaFlavour(GreenTeaFlavourBuilder config) {
        this.withJasmine = config.withJasmine;
        this.withRaspberry = config.withRaspberry;
    }

    public String getDescription() {
        StringBuilder description = new StringBuilder("Lovely green tea");

        if (withJasmine) {
            description.append(" with jasmine flavour");
        }
        if (withJasmine && withRaspberry) {
            description.append(" and");
        }
        if (withRaspberry) {
            description.append(" with a touch of raspberry");
        }

        return description.toString();
    }
}
