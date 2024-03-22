package org.ergemp.fileIOExamples.workshop;

import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {

        File ffile = new File ("ttt");
        File dir = new File(".");
        String[] flist = dir.list();

        for (Integer i=0;i<flist.length;i++)
        {
            System.out.println(flist[i]);
        }
        System.out.println(dir.getPath().toString());

        try
        {
            if (ffile.exists())
            {
                ffile.delete();
            }
            else
            {
                ffile.createNewFile();
                /*
                java.io.FileWriter fw = new FileWriter(ffile);
                fw.write("1- this is written to the file");
                fw.write("2- this is written to the file");
                fw.flush();
                fw.close();
                */

                BufferedWriter bw = new BufferedWriter(new FileWriter(ffile));
                bw.write("1- this is written to the file");
                bw.newLine();
                bw.write("2- this is written to the file");
                bw.flush();
                bw.close();

                BufferedReader br = new BufferedReader(new FileReader(ffile));

                String rread;

                while ((rread = br.readLine()) != null)
                {
                    System.out.println(rread);
                }
            }
        }
        catch (Exception Ex)
        {
            System.err.println(Ex.getMessage().toString());
        }
    }
}
