package org.ergemp.regexExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleMatcherExample {
    public static void main(String[] args)
    {
        Pattern pattern = Pattern.compile("Alex|Brian");
        Matcher matcher = pattern.matcher("Generally, Alex and Brian share a great bonding.");

        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(" - " + matcher.group());
        }
    }
}

/*
Start index: 11 End index: 15  - Alex
Start index: 20 End index: 25  - Brian
* */

//https://howtodoinjava.com/java-regular-expression-tutorials/