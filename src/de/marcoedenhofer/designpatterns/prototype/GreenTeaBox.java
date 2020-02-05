package de.marcoedenhofer.designpatterns.prototype;

public class GreenTeaBox extends AbstractTeaBoxPrototype {
    private String receiverName;

    protected GreenTeaBox(int volume, String receiverName) {
        super(volume);
        this.receiverName = receiverName;
    }

    @Override
    public AbstractTeaBoxPrototype makeCopy() {
        return new GreenTeaBox(super.getVolume(), receiverName);
    }

    @Override
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @Override
    public String getReceiverName() {
        return receiverName;
    }

    @Override
    public String toString() {
        return "GreenTeaBox for recipient: " + receiverName + " with a volume of: " + getVolume() + "l";
    }
}
