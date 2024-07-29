package org.ergemp.fileIOExamples.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data/car.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Car car = (Car)ois.readObject();

            System.out.println(car.make);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
