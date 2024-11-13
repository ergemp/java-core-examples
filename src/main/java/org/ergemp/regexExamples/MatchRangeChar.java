package org.ergemp.regexExamples;

import java.util.regex.Pattern;

public class MatchRangeChar {
    public static void main(String[] args)
    {
        System.out.println(Pattern.compile("[a-f]").matcher("b").matches());    //true
        System.out.println(Pattern.compile("[a-f]").matcher("g").matches());    //false

        System.out.println(Pattern.compile("[a-zA-Z]").matcher("a").matches()); //true
        System.out.println(Pattern.compile("[a-zA-Z]").matcher("B").matches()); //true
        System.out.println(Pattern.compile("[a-zA-Z]").matcher("4").matches()); //false

        System.out.println(Pattern.compile("[0-9]").matcher("9").matches());    //true
        System.out.println(Pattern.compile("[0-9]").matcher("91").matches());   //false
    }
}

//https://howtodoinjava.com/regex/match-any-set-of-characters/