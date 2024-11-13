package org.ergemp.regexExamples;

import java.util.regex.Pattern;

public class MatchAnyChar {
    public static void main(String[] args)
    {
        System.out.println(Pattern.compile(".").matcher("a").matches());    //true
        System.out.println(Pattern.compile(".").matcher("ab").matches());   //false

        System.out.println(Pattern.compile("A.B").matcher("AIB").matches());    //true
        System.out.println(Pattern.compile("A.B").matcher("ABI").matches());    //false

        System.out.println(Pattern.compile(".*").matcher("AIB").matches());     //true
    }
}

//https://howtodoinjava.com/regex/match-any-set-of-characters/