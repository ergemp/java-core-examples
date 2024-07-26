package org.ergemp.dataStructures.collections.util;

public class Nvl {
    public static <T> T nvl(T a, T b) {
        return (a == null || a.toString().trim().equalsIgnoreCase(""))?b:a;
    }
}
