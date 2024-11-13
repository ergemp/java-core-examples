package org.ergemp.javaStreams.operator;

import org.ergemp.javaStreams.util.Person2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class Examples2 {
    public static void main(String[] args)
    {

        List<Person2> javaProgrammers = new ArrayList<Person2>() {
            {
                add(new Person2("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
                add(new Person2("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
                add(new Person2("Floyd", "Donny", "Java programmer", "male", 33, 1800));
                add(new Person2("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
                add(new Person2("Vere", "Hervey", "Java programmer", "male", 22, 1200));
                add(new Person2("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
                add(new Person2("Shawn", "Randall", "Java programmer", "male", 30, 2300));
                add(new Person2("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
                add(new Person2("Palmer", "Dene", "Java programmer", "male", 33, 2000));
                add(new Person2("Addison", "Pam", "Java programmer", "female", 34, 1300));
            }
        };

        List<Person2> phpProgrammers = new ArrayList<Person2>() {
            {
                add(new Person2("Jarrod", "Pace", "PHP programmer", "male", 34, 1550));
                add(new Person2("Clarette", "Cicely", "PHP programmer", "female", 23, 1200));
                add(new Person2("Victor", "Channing", "PHP programmer", "male", 32, 1600));
                add(new Person2("Tori", "Sheryl", "PHP programmer", "female", 21, 1000));
                add(new Person2("Osborne", "Shad", "PHP programmer", "male", 32, 1100));
                add(new Person2("Rosalind", "Layla", "PHP programmer", "female", 25, 1300));
                add(new Person2("Fraser", "Hewie", "PHP programmer", "male", 36, 1100));
                add(new Person2("Quinn", "Tamara", "PHP programmer", "female", 21, 1000));
                add(new Person2("Alvin", "Lance", "PHP programmer", "male", 38, 1600));
                add(new Person2("Evonne", "Shari", "PHP programmer", "female", 40, 1800));
            }
        };

        System.out.println("Show programmers names:");
        javaProgrammers.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));
        phpProgrammers.forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

        System.out.println("Increase salary by 5% to programmers:");
        Consumer<Person2> giveRaise = e -> e.setSalary(e.getSalary() / 100 * 5 + e.getSalary());

        javaProgrammers.forEach(giveRaise);
        phpProgrammers.forEach(giveRaise);

        //
        //filter example
        //
        System.out.println("Show PHP programmers that earn more than $1,400:");
        phpProgrammers.stream()
                .filter((p) -> (p.getSalary() > 1400))
                .forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

        //
        //predefined filters example
        //
        // Define some filters
        Predicate<Person2> ageFilter = (p) -> (p.getAge() > 25);
        Predicate<Person2> salaryFilter = (p) -> (p.getSalary() > 1400);
        Predicate<Person2> genderFilter = (p) -> ("female".equals(p.getGender()));

        System.out.println("Show female PHP programmers that earn more than $1,400 and are older than 24 years:");
        phpProgrammers.stream()
                .filter(ageFilter)
                .filter(salaryFilter)
                .filter(genderFilter)
                .forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

        // Reuse filters
        System.out.println("Show female Java programmers older than 24 years:");
        javaProgrammers.stream()
                .filter(ageFilter)
                .filter(genderFilter)
                .forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

        //
        //limiting the results
        //
        System.out.println("Show first 3 Java programmers:");
        javaProgrammers.stream()
                .limit(3)
                .forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

        System.out.println("Show first 3 female Java programmers:");
        javaProgrammers.stream()
                .filter(genderFilter)
                .limit(3)
                .forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));

        //
        //sorting example
        //
        System.out.println("Sort and show the first 5 Java programmers by name:");
        List<Person2> sortedJavaProgrammers = javaProgrammers
                .stream()
                .sorted((p, p2) -> (p.getFirstName().compareTo(p2.getFirstName())))
                .limit(5)
                .collect(toList());

        sortedJavaProgrammers.forEach((p) -> System.out.printf("%s %s; %n", p.getFirstName(), p.getLastName()));

        System.out.println("Sort and show Java programmers by salary:");
        sortedJavaProgrammers = javaProgrammers
                .stream()
                .sorted((p, p2) -> (p.getSalary() - p2.getSalary()))
                .collect(toList());

        sortedJavaProgrammers.forEach((p) -> System.out.printf("%s %s; %n", p.getFirstName(), p.getLastName()));

        //
        //min and max functions
        //
        System.out.println("Get the lowest Java programmer salary:");
        Person2 pers = javaProgrammers
                .stream()
                .min((p1, p2) -> (p1.getSalary() - p2.getSalary()))
                .get();

        System.out.printf("Name: %s %s; Salary: $%,d.", pers.getFirstName(), pers.getLastName(), pers.getSalary());

        System.out.println("Get the highest Java programmer salary:");
        Person2 person = javaProgrammers
                .stream()
                .max((p, p2) -> (p.getSalary() - p2.getSalary()))
                .get();

        System.out.printf("Name: %s %s; Salary: $%,d.", person.getFirstName(), person.getLastName(), person.getSalary());

        //
        //Map function
        //
        //bug in netbeans with map function 09.10.2018
        /*
        System.out.println("Get PHP programmers first name to String:");
        String phpDevelopers = phpProgrammers
                  .stream()
                  .map(person::getFirstName)
                  .collect(joining(";"));    // this can be used as a token in further operations

        System.out.println("Get Java programmers first name to Set:");
        Set<String> javaDevFirstName = javaProgrammers
                  .stream()
                  .map(person::getFirstName)
                  .collect(toSet());

        System.out.println("Get Java programmers last name to TreeSet:");
        TreeSet<String> javaDevLastName = javaProgrammers
                  .stream()
                  .map(person::getLastName)
                  .collect(toCollection(TreeSet::new));
        */

        //
        //run stream in parallel
        //
        System.out.println("Calculate total money spent for paying Java programmers:");
        int totalSalary = javaProgrammers
                .parallelStream()
                .mapToInt(p -> p.getSalary())
                .sum();

        //
        //Get count, min, max, sum, and average for numbers
        //
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntSummaryStatistics stats = numbers
                .stream()
                .mapToInt((x) -> x)
                .summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
    }
}
