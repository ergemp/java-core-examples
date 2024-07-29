package org.ergemp.fileIOExamples.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {
    public static void main(String[] args) {
        Car car = new Car();

        car.color = "red";
        car.make = "mini";
        car.model = "coupe";
        car.year = 2015;
        car.plate = "34TT2024";

        try {
            FileOutputStream fos = new FileOutputStream("data/car.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(car);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }


    }
}
