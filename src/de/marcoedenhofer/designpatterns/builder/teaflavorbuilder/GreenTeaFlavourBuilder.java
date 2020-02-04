package de.marcoedenhofer.designpatterns.builder.teaflavorbuilder;

public class GreenTeaFlavourBuilder {
    protected boolean withJasmine = false;
    protected boolean withRaspberry = false;

    public GreenTeaFlavourBuilder withJasmine() {
        this.withJasmine = true;
        return this;
    }

    public GreenTeaFlavourBuilder withRaspberry() {
        this.withRaspberry = true;
        return this;
    }

    public GreenTeaFlavour create() {
        GreenTeaFlavour greenTeaFlavour = new GreenTeaFlavour(this);
        // reset, so no new builder has to be created every time a new config is wanted
        resetBuilderState();
        return greenTeaFlavour;

    }

    private void resetBuilderState() {
        this.withJasmine = false;
        this.withRaspberry = false;
    }
}
