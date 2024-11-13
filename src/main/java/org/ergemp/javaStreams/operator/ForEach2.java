package org.ergemp.javaStreams.operator;

import java.util.Arrays;
import java.util.List;

//
//examples from:
//https://www.developer.com/java/start-using-java-lambda-expressions.html
//
public class ForEach2 {
    public static void main(String[] args)
    {
        Integer x = 0;
        Integer y = 0 ;

        //y = x -> x + 5;

        String[] atp = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro"};
        List<String> players =  Arrays.asList(atp);

        // Old looping
        for (String player : players) {
            System.out.print(player + "; ");
        }

        // Using lambda expression and functional operations
        players.forEach((player) -> System.out.print(player + "; "));

        // Using double colon operator in Java 8
        players.forEach(System.out::println);
    }
}
