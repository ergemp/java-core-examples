package org.ergemp.inheritance;

public class InterfaceImpl implements Iinterface {

    @Override
    public int move() {
        System.out.println("InterfaceImpl: implements move");
        return 0;
    }

    public void slide() {};

    public static void main(String[] args) {

        InterfaceImpl impl = new InterfaceImpl();
        impl.move();
        impl.display();

    }
}
