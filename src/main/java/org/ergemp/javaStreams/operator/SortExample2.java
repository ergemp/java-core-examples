package org.ergemp.javaStreams.operator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortExample2 {
    public static void main(String[] args)
    {
        String[] players = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro", "Richard Gasquet", "John Isner"};

        System.out.println("unsorted\n********");
        List<String> playersList = Arrays.asList(players);
        playersList.forEach((item) -> System.out.println(item));

        // Sort players by name using anonymous innerclass
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });

        System.out.println("sorted\n******");
        List<String> playersSortedList = Arrays.asList(players);
        playersList.forEach((item) -> System.out.println(item));


        // Sort players by name using lambda expression
        Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
        Arrays.sort(players, sortByName);

        // or this
        Arrays.sort(players, (String s1, String s2) -> (s1.compareTo(s2)));

    }

    //
    //sort a list of players based on name, surname, name length and last name letter
    //
    public static void otherExamples()
    {
        String[] players = {"Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer", "Andy Murray", "Tomas Berdych", "Juan Martin Del Potro", "Richard Gasquet", "John Isner"};

        // Sort players by surname using anonymous innerclass
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" "))));
            }
        });

        // Sort players by surname using lambda expression
        Comparator<String> sortBySurname = (String s1, String s2) -> (s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" "))));

        Arrays.sort(players, sortBySurname);
        // or this
        Arrays.sort(players, (String s1, String s2) -> (s1.substring(s1.indexOf(" ")).compareTo(s2.substring(s2.indexOf(" ")))));

        // Sort players by name lenght using anonymous innerclass
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.length() - s2.length());
            }
        });

        // Sort players by name lenght using lambda expression
        Comparator<String> sortByNameLength = (String s1, String s2) -> (s1.length() - s2.length());

        Arrays.sort(players, sortByNameLength);
        // or this
        Arrays.sort(players, (String s1, String s2) -> (s1.length() - s2.length()));

        // Sort players by last letter using anonymous innerclass
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
            }
        });

        // Sort players by last letter using lambda expression
        Comparator<String> sortByLastLetter = (String s1, String s2) -> (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
        Arrays.sort(players, sortByLastLetter);
        // or this
        Arrays.sort(players, (String s1, String s2) -> (s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1)));

    }
}
