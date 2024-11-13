package org.ergemp.javaStreams.operator;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class AnyMatch {
    public static void main(String[] args)
    {
        Supplier<Stream<String>> streamSupplier =
                () -> Stream.of("d2", "a2", "b1", "b3", "c")
                        .filter(s -> s.startsWith("a"));

        streamSupplier.get().anyMatch(s -> {
            System.out.println(s);
            return true;});   // ok
        streamSupplier.get().noneMatch(s -> {
            System.out.println(s);
            return false;});  // ok
    }
}
