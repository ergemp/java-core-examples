package org.ergemp.basics.dataTypes;

public class DoubleTypeExamples {
    public static void main(String[] args) {

        // sister type of float. It provides a greater resolution:
        // double numbers can have even more decimal places

        double dNumber1 = 5.7;
        double dNumber2 = 6.85431;

        float fNumber = (float)dNumber1/(float)dNumber2;
        fNumber = (float) (dNumber1/dNumber2);

    }
}
