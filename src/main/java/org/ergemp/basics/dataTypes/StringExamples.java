package org.ergemp.basics.dataTypes;

public class StringExamples {
    public static void main(String[] args) {

        // String concat with + sign
        char c = 'c';
        String s1 = "stringone";
        String s2 = "stringtwo";
        String s3 = s1+s2+"LIT";
        System.out.println(s3);

        // String methods
        String s = "hello";
        System.out.println(s.toUpperCase());
        System.out.println(s.replace("h","H"));

        // Escape sequence
        String ss = "The program says: \"Hello World\"";
        System.out.println(ss);



    }
}
