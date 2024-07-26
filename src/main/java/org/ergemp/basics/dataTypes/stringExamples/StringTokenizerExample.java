package org.ergemp.basics.dataTypes.stringExamples;

import java.util.*;
import java.util.stream.Collectors;

public class StringTokenizerExample {
    public static void main(String[] args)
    {
        String str = "This is String, split by StringTokenizer, created by: mkyong";

        System.out.println("---- Split by space ------");
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }

        System.out.println("---- Split by comma ------");
        StringTokenizer st2 = new StringTokenizer(str,",");
        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }

        System.out.println("---- Split by multiple chars ------");
        StringTokenizer st3 = new StringTokenizer(str,",:");
        while (st3.hasMoreElements()) {
            System.out.println(st3.nextElement());
        }

        System.out.println("---- java8 example ------");
        List<String> ret = getTokensWithCollection(str);
        Iterator it = ret.iterator();

        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }

        System.out.println("---- nextToken example ------");
        List<String> tokens = new ArrayList<>();
        StringTokenizer st4 = new StringTokenizer(str,",");

        //while (st4.hasMoreTokens()) {
        while (st4.hasMoreElements()) {
            tokens.add(st4.nextToken(" "));
        }

        Iterator it4 = tokens.iterator();
        while (it4.hasNext())
        {
            System.out.println(it4.next().toString());
        }
    }

    public static List<String> getTokensWithCollection(String str)
    {
        return Collections.list(new StringTokenizer(str, ",")).stream()
                .map(token -> (String) token)
                .collect(Collectors.toList());
    }
}
