package org.ergemp.inheritance;

public abstract class AbstractBase {

    // Java abstract class is a class that can not be initiated by itself,
    // it needs to be subclassed by another class to use its properties.
    // An abstract class is declared using the “abstract” keyword in its class definition.

    public String firstName ;
    public String lastName;

    // Constructor of class 1
    AbstractBase() {
        // Print statement
        System.out.println("abstractBase Constructor Called");
    }

    void method1(){
        System.out.println("execution Base: method1");
    }

    final void method2(){
        System.out.println("execution Base: method2");
    }

    // Abstract methods cannot have a body
    /*
    abstract String getFullName (){
        return firstName + " " + lastName;
    }
    */

    abstract String AgetFullName ();

    public String getFullName () {
        return firstName + " " + lastName;
    };

}
