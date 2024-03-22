package org.ergemp.fileIOExamples;

import java.io.File;

public class FileExamples {
    public static void main(String[] args) {

        String path = "";
        boolean bool = false;
        try {
            // createing  new files
            File file  = new File("data/testFileee.txt");
            file.createNewFile();
            System.out.println(file);

            // createing new canonical from file object
            File file2 = file.getCanonicalFile();

            // returns true if the file exists
            System.out.println(file2);
            bool = file2.exists();

            // returns absolute pathname
            path = file2.getAbsolutePath();
            System.out.println(bool);

            // if file exists
            if (bool) {
                // prints
                System.out.print(path + " Exists? " + bool);
            }
        } catch (Exception e) {
            // if any error occurs
            e.printStackTrace();
        }

        //
        //
        //

        File f = new File(".");
        String filenames[] = f.list();
        for(String filename : filenames){
            System.out.println(filename);
        }

        //
        //
        //

        File dir = new File(".");
        File files[] = dir.listFiles();

        for (File file : files) {
            System.out.println(file.getName() + " Can Write: " + file.canWrite() +
                    "Is Hidden: " + file.isHidden() + " Length: " + file.length() + " bytes");
        }
    }
}

/*
    static File	createTempFile(String prefix, String suffix)	It creates an empty file in the default temporary-file directory, using the given prefix and suffix to generate its name.
    boolean	createNewFile()	                                    It atomically creates a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist.
    boolean	canWrite()	                                        It tests whether the application can modify the file denoted by this abstract pathname.String[]
    boolean	canExecute()	                                    It tests whether the application can execute the file denoted by this abstract pathname.
    boolean	canRead()	                                        It tests whether the application can read the file denoted by this abstract pathname.
    boolean	isAbsolute()	                                    It tests whether this abstract pathname is absolute.
    boolean	isDirectory()	                                    It tests whether the file denoted by this abstract pathname is a directory.
    boolean	isFile()	                                        It tests whether the file denoted by this abstract pathname is a normal file.
    String	getName()	                                        It returns the name of the file or directory denoted by this abstract pathname.
    String	getParent()	                                        It returns the pathname string of this abstract pathname's parent, or null if this pathname does not name a parent directory.
    Path	toPath()	                                        It returns a java.nio.file.Path object constructed from the this abstract path.
    URI	toURI()	                                                It constructs a file: URI that represents this abstract pathname.
    File[]	listFiles()	                                        It returns an array of abstract pathnames denoting the files in the directory denoted by this abstract pathname
    long	getFreeSpace()	                                    It returns the number of unallocated bytes in the partition named by this abstract path name.
    String[]	list(FilenameFilter filter)	                    It returns an array of strings naming the files and directories in the directory denoted by this abstract pathname that satisfy the specified filter.
    boolean	mkdir()	                                            It creates the directory named by this abstract pathname.
*/
