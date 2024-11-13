package org.ergemp.apacheCommons.commonsCSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class javaCSVExample {
    public static void main(String[] args){

        System.out.println("Reading from CSV file using BufferedReader and String Split");
        List nations = null;
        try {
            nations = readCSV();
        } catch (IOException e) {
            e.printStackTrace();
        }
        print(nations);


    }

    public static List readCSV() throws FileNotFoundException, IOException {
        List countries = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("mockdata/countries.csv"));

        String line = br.readLine(); // Reading header, Ignoring

        while ((line = br.readLine()) != null && !line.isEmpty()) {
            String[] fields = line.split(",");
            String name = fields[0];
            String capital = fields[1];
            String currency = fields[2];

            Country nation = new Country(name, capital, currency);
            countries.add(nation);
        }
        br.close();

        return countries;
    }


    private static class Country {
        private String name;
        private String capital;
        private String currency;

        public Country(String name, String capital, String currency) {
            this.name = name;
            this.capital = capital;
            this.currency = currency;
        }

        public String name() { return name; }
        public String capital() { return capital; }
        public String currency() { return currency; }

        @Override public String toString() {
            return "Country [name=" + name + ", capital=" + capital + ", currency=" + currency + "]"; }
    }

    public static void print(List<Country> countries) {
        System.out.println("========================");
        for (Country country : countries) { System.out.println(country); }
        System.out.println("========================"); }




}
