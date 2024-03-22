package org.ergemp.fileIOExamples.characterStreams;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {
    public static void main(String[] args) {

        // OutputStreamWriter is a class which is used to convert character stream to byte stream,
        // the characters are encoded into byte using a specified charset.
        // write() method calls the encoding converter which converts the character into bytes.
        // The resulting bytes are then accumulated in a buffer before being written into the underlying output stream.
        // The characters passed to write() methods are not buffered.
        // We optimize the performance of OutputStreamWriter by using it with in a BufferedWriter so that to avoid frequent converter invocation.

        try {
            OutputStream outputStream = new FileOutputStream("data/output.txt");
            Writer outputStreamWriter = new OutputStreamWriter(outputStream);

            outputStreamWriter.write("Hello World");

            outputStreamWriter.close();
        } catch (Exception e) {
            e.getMessage();
        }


    }
}
/*
    void	close()	                                It closes the stream, flushing it first.
    void	flush()	                                It flushes the stream.
    String	getEncoding()	                        It returns the name of the character encoding being used by this stream.
    void	write(char[] cbuf, int off, int len)	It writes a portion of an array of characters.
    void	write(int c)	                        It writes a single character.
    void	write(String str, int off, int len)	    It writes a portion of a string.
*/