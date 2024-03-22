package org.ergemp.fileIOExamples.characterStreams;

import java.io.*;

public class InputStreamReaderExample {
    public static void main(String[] args) {

        // An InputStreamReader is a bridge from byte streams to character streams:
        // It reads bytes and decodes them into characters using a specified charset.
        // The charset that it uses may be specified by name or may be given explicitly,
        // or the platform's default charset may be accepted.

        try  {
            InputStream stream = new FileInputStream("data/fileTest.txt");
            Reader reader = new InputStreamReader(stream);
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }

            //
            // ref: https://medium.com/@lavishj77/java-i-o-character-stream-implementation-c105bd6238c
            //

            File file = new File("data/fileTest.txt");
            OutputStream fos = new FileOutputStream(file);

            Writer osw = new OutputStreamWriter(fos);

            osw.write('ל');  //write(int), write(char)
            osw.write("\nhello\n");  // write(String)
            osw.write(new char[]{'J','a','v','a'});  // write(char[])

            osw.flush();
            osw.close();
            fos.flush();
            fos.close();

            InputStream fis = new FileInputStream(file);
            Reader isr = new InputStreamReader(fis);

            int data2 = isr.read();

            while(data2 != -1){
                System.out.print((char)data2);
                data2 = isr.read();
            }
            /* read(char[]) can also be used which  will read complete data in char array */


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
    void	close()	                                It closes the stream and releases any system resources associated with it.
    String	getEncoding()	                        It returns the name of the character encoding being used by this stream.
    int	read()	                                    It reads a single character.
    int	read(char[] cbuf, int offset, int length)	It reads characters into a portion of an array.
    boolean	ready()	                                It tells whether this stream is ready to be read.
 */
