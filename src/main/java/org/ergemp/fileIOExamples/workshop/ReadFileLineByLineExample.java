package org.ergemp.fileIOExamples.workshop;

import java.io.*;


public class ReadFileLineByLineExample {
    public static void main(String[] args){

        FileInputStream fis = null;
        BufferedReader reader = null;

        try {
            fis = new FileInputStream("mockdata/countries.txt");
            reader = new BufferedReader(new InputStreamReader(fis));

            System.out.println("Reading File line by line using BufferedReader");

            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }

        }
        catch (FileNotFoundException ex) {
        }
        catch (IOException ex) {
        } finally {
            try {
                reader.close();
                fis.close();
            }
            catch (IOException ex) {
            }
        }
    }
}
