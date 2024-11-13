package org.ergemp.javaStreams.creator;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamOfFile {
    public static void main(String[] args) throws IOException
    {
        Path path = Paths.get("resources/file.txt");
        Stream<String> streamOfStrings = Files.lines(path);
        Stream<String> streamWithCharset = Files.lines(path, Charset.forName("UTF-8"));

        streamOfStrings.forEach(System.out::println);
        streamWithCharset.forEach(System.out::println);

        streamOfStrings.close();
        streamWithCharset.close();
    }
}

//https://dzone.com/articles/8-ways-of-creating-a-stream-object-in-java-8
