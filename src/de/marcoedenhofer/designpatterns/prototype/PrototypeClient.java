package de.marcoedenhofer.designpatterns.prototype;


import java.util.List;

public class PrototypeClient {
    public static void main(String[] args) {
        AbstractTeaBoxPrototype smallTeaBox1 = new GreenTeaBox(10, "Huber");
        AbstractTeaBoxPrototype smallTeaBox2 = smallTeaBox1.makeCopy();
        AbstractTeaBoxPrototype smallTeaBox3 = smallTeaBox1.makeCopy();
        smallTeaBox3.setReceiverName("Winston");

        AbstractTeaBoxPrototype bigTeaBox1 = new GreenTeaBox(25, "Mueller");
        AbstractTeaBoxPrototype bigTeaBox2 = bigTeaBox1.makeCopy();
        bigTeaBox2.setReceiverName("McLeary");

        List<AbstractTeaBoxPrototype> teaBoxes = List.of(smallTeaBox1, smallTeaBox2, smallTeaBox3,
                bigTeaBox1, bigTeaBox2);
        teaBoxes.forEach(System.out::println);
    }


}
