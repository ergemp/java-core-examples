package org.ergemp.apacheCommons.commonsCSV;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class commonsCSVExample {
    public static void main(String[] args){
        try {
            parseCSV();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void parseCSV() throws FileNotFoundException, IOException {
        CSVParser parser = new CSVParser(new FileReader("mockdata/countries.csv"), CSVFormat.DEFAULT.withHeader());
        for (CSVRecord record : parser) {
            System.out.printf("%s\t%s\t%s\n", record.get("NAME"), record.get("CAPITAL"), record.get("CURRENCY"));
        }
        parser.close();
    }


}
