package org.ergemp.basics.dataTypes.stringExamples;

public class SplitExample {
    public static void main(String[] args)
    {
        String str = "ergem$peker$ergemp";

        String splitchar = "$";
        splitchar = "\\" + splitchar;
        Integer ll = str.split(splitchar).length;

        System.out.println(ll);
    }
}
