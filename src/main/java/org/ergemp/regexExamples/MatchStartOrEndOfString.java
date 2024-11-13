package org.ergemp.regexExamples;

import java.util.regex.Pattern;

public class MatchStartOrEndOfString {
    public static void main(String[] args){

        //Regex patterns to match start of line
        /*
        Line starts with number                         "^\\d" or "^[0-9]"
        Line starts with character                      "^[a-z]" or "^[A-Z]"
        Line starts with character (case-insensitive)   "^[a-zA-Z]"
        Line starts with word                           "^word"
        Line starts with special character              "^[!@#\\$%\\^\\&*\\)\\(+=._-]"
        */

        System.out.println(Pattern.compile("^[0-9]").matcher("1stKnight").find());
        System.out.println(Pattern.compile("^[a-zA-Z]").matcher("FirstKnight").find());
        System.out.println(Pattern.compile("^First").matcher("FirstKnight").find());
        System.out.println(Pattern.compile("^[!@#\\$%\\^\\&*\\)\\(+=._-]").matcher("*1stKnight").find());

        //Regex patterns to match end of line
        System.out.println(Pattern.compile("[0-9]$").matcher("FirstKnight123").find());
        System.out.println(Pattern.compile("[a-zA-Z]$").matcher("FirstKnight").find());
        System.out.println(Pattern.compile("Knight$").matcher("FirstKnight").find());
        System.out.println(Pattern.compile("[!@#\\$%\\^\\&*\\)\\(+=._-]$").matcher("FirstKnight&").find());


    }
}

/*
true
true
true
true
true
true
true
true
* */