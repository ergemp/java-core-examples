package org.ergemp.basics.dataTypes;

public class FloatTypeExamples {
    public static void main(String[] args) {

        int iNumber = 5;
        float fNumber;

        // a number with decimal places is assumed to be of this type and is called double;
        // it's a sister type of the float data type, but it's not quite the same

        // we need to do is tell Java to treat 5.5 as a float type number instead of double.
        // To do this, all we need to do is put f after the digits

        fNumber = 5.5f;

        System.out.println(iNumber);
        System.out.println(fNumber);

        //

        iNumber = 5/4;
        fNumber = 5.0f/4.0f;
        System.out.println(iNumber);
        System.out.println(fNumber);

        // the computation on the right-hand side of our equals sign occurs
        // before the value of our floating-point variable fNumber changes,
        // we're going to see the same output in both the calculations of 5/4

        iNumber = 5/4;
        fNumber = 5/4;

        System.out.println(iNumber);
        System.out.println(fNumber);

        iNumber = 5/4;
        fNumber = 5/4.0f;

        System.out.println(iNumber);
        System.out.println(fNumber);

    }
}
