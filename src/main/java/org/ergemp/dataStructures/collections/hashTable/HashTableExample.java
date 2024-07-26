package org.ergemp.dataStructures.collections.hashTable;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {

        // ref: https://www.geeksforgeeks.org/hashtable-in-java/

        // Hashtable(): This creates an empty hashtable with the default load factor of 0.75 and an initial capacity is 11.
        // HashMap does not provide any Enumeration, while Hashtable provides not fail-fast Enumeration.

        // `Hashtable` class has since been considered obsolete and its use is generally discouraged.
        // This is primarily due to its synchronized nature by default,
        // which can result in slower performance compared to other implementations of the `Map` interface like `HashMap`

        // Hashtable<K, V> ht = new Hashtable<K, V>(int size, float fillRatio);
        // Hashtable<K, V> ht = new Hashtable<K, V>(int initialCapacity);

        // No need to mention the
        // Generic type twice
        Hashtable<Integer, String> ht1 = new Hashtable<>();

        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2
                = new Hashtable<Integer, String>();

        // Inserting the Elements
        // using put() method
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");

        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);
    }
}
