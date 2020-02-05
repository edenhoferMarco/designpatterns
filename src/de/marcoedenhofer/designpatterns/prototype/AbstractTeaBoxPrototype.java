package de.marcoedenhofer.designpatterns.prototype;

public abstract class AbstractTeaBoxPrototype {
    private int volume;

    public AbstractTeaBoxPrototype(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public abstract AbstractTeaBoxPrototype makeCopy();
    public abstract void setReceiverName(String receiverName);
    public abstract String getReceiverName();

}
