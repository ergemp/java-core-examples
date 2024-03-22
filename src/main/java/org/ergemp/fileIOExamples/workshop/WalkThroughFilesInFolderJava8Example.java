package org.ergemp.fileIOExamples.workshop;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class WalkThroughFilesInFolderJava8Example {
    public static void main(String[] args){
        try {
            Files.walk(Paths.get("resources"))
                    .filter(Files::isRegularFile)
                    .forEach(System.out::println);

            List<Path> pathList = Files.walk(Paths.get("resources"))
                    .filter(Files::isRegularFile)
                    .collect(Collectors.toList());

            List<File> filesInFolder = Files.walk(Paths.get("resources"))
                    .filter(Files::isRegularFile)
                    .map(Path::toFile)
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
