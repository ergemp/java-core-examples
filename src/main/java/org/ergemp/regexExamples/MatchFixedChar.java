package org.ergemp.regexExamples;

import java.util.regex.Pattern;

public class MatchFixedChar {
    public static void main(String[] args)
    {
        System.out.println(Pattern.compile("[abc]").matcher("a").matches());    //true
        System.out.println(Pattern.compile("[abc]").matcher("ab").matches());   //false
        System.out.println(Pattern.compile("[abc]").matcher("d").matches());    //false

        System.out.println(Pattern.compile("[aA]").matcher("a").matches());     //true
        System.out.println(Pattern.compile("[aA]").matcher("A").matches());     //true
        System.out.println(Pattern.compile("[aA]").matcher("b").matches());     //false
    }
}

//https://howtodoinjava.com/regex/match-any-set-of-characters/