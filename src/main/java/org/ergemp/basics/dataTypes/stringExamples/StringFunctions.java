package org.ergemp.basics.dataTypes.stringExamples;

public class StringFunctions {
    public static void main(String[] args)
    {
        String raw = "ttüğşçöıtt";
        String rep = "";

        rep = raw.replaceAll("[üğşçöı]", "ugscoi");
        System.out.println(rep);

        String jsonString = "\"ts\":\"123456\"";
        System.out.println(jsonString);
        System.out.println(jsonString.replaceAll(".ts.:.(\\d+).","ttt-$1000-ttt"));

    }
}
