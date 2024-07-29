package org.ergemp.inheritance;

interface Iinterface {

    // An Interface in Java programming language is defined as an abstract type
    // used to specify the behavior of a class. An interface in Java is a blueprint of a behavior.
    // A Java interface contains static constants and abstract methods.

    // The reason is, abstract classes may contain non-final variables,
    // whereas variables in the interface are final, public, and static.

    final int id = 10;

    public int move();
    public void slide();

    default void display()
    {
        System.out.println("Iinterface: display");
    }


}
