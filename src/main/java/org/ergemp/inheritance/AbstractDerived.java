package org.ergemp.inheritance;

public class AbstractDerived extends AbstractBase {
    public String gender;

    // abstract methods of the super class must have been implemented
    public String AgetFullName() {
        // Abstract method 'getFullName()' cannot be accessed directly
        // return "Human is: " + super.getFullName();

        return "Human is: " + super.firstName + " " + super.lastName;
    }

    public void method1(){
        System.out.println("execution Derived: method1");
    }

    // 'method2()' cannot override 'method2()' in 'org.ergemp.inheritance.abstractBase';
    // overridden method is final
    /*
    public void method2(){
        System.out.println("execution Derived: method2");
    }
    */

}
