package org.ergemp.inheritance;

public class AbstractMain {
    public static void main(String[] args) {

        AbstractBase persona = new AbstractBase() {
            String AgetFullName() {
                return "null";
            }
        };

        System.out.println(persona.AgetFullName());

        AbstractDerived human = new AbstractDerived();

        human.firstName = "john";
        human.lastName = "doe";
        human.gender = "male";

        System.out.println(human.getFullName());

        // method1 overriden
        human.method1();

        // final method2 cannot be overriden since it is declared as final
        human.method2();

    }
}
