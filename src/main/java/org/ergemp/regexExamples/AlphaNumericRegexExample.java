package org.ergemp.regexExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlphaNumericRegexExample {
    public static void main(String[] args){
        List<String> names = new ArrayList<String>();

        names.add("Lokesh");
        names.add("LOkesh123");
        names.add("LOkesh123-");  //Incorrect

        String regex = "^[a-zA-Z0-9]+$";

        Pattern pattern = Pattern.compile(regex);

        for (String name : names) {
            Matcher matcher = pattern.matcher(name);
            System.out.println(matcher.matches());
        }
    }
}

//https://howtodoinjava.com/regex/regex-alphanumeric-characters/