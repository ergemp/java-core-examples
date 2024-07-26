package org.ergemp.dataStructures.collections.hashMap;

import java.util.HashMap;
import java.util.Map;

public class OverKeysOrValuesUsingKeyset {
    public static void main(String[] args){
        Map<String,String> gfg = new HashMap<String,String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        // using keySet() for iteration over keys
        for (String name : gfg.keySet())
            System.out.println("key: " + name);

        // using values() for iteration over keys
        for (String url : gfg.values())
            System.out.println("value: " + url);
    }
}
