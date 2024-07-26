package org.ergemp.basics.branching;

public class SwitchExample {
    public static void main(String[] args) {

        int x=7;

        // switch example
        switch(x)
        {
            case 1: case 5: case 7:
                System.out.println("RED");
                break;
            case 2:
                System.out.println("BLUE");
                break;
            case 3:
                System.out.println("GREEN");
                break;
            default:
                System.out.println("NONE");
                break;
        }

    }
}
