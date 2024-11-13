package org.ergemp.javaStreams.creator;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Primitives {
    public static void main(String[] args)
    {
        IntStream intStream = IntStream.range(1, 3);
        intStream.forEach(System.out::println);
        LongStream longStream = LongStream.rangeClosed(1, 3);
        longStream.forEach(System.out::println);
        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);
        doubleStream.forEach(System.out::println);

    }
}

/*
1
2
1
2
3
0.011853259861223098
0.34686765197366876
0.3050339409240934
*/