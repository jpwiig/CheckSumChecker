package org.jpwiig;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandler {
    private File newFile;
    private File checkSumfile;
    private static Scanner sc;
    private long checksum;

    //to load a single file and to create a checksum
    public FileHandler(String path) {
        newFile = new File(path);
    }
    //Checks loads a file with a checksum file
    public FileHandler(String path, String checksum) {
        newFile = new File(path);
        checkSumfile = new File(checksum);
    }
   private static long CheckSumFileToLong(File ChecksumFile) throws FileNotFoundException {
        sc = new Scanner(ChecksumFile);
        String getContent = sc.nextLine();
        return Long.parseLong(getContent);
   }
}
