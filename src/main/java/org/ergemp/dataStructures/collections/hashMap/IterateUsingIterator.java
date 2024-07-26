package org.ergemp.dataStructures.collections.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateUsingIterator {
    public static void main(String[] args){
        Map<String,String> gfg = new HashMap<String,String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        // using iterators
        Iterator<Map.Entry<String, String>> itr = gfg.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<String, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
    }
}
