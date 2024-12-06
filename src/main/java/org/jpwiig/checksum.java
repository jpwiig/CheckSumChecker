package org.jpwiig;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

public class checksum {
    private String hashValue; //the checksum for the program
    private InputStream fromAplace;

    private static long createChecksum(InputStream shadyFile, int buffer) throws IOException {
        //error handling here
        CheckedInputStream checkstream = new CheckedInputStream(shadyFile, new CRC32());
        byte [] bufferthing = new byte[buffer];
        while(checkstream.read(bufferthing, 0, bufferthing.length ) >= 0) {}
        return checkstream.getChecksum().getValue();
    }
    public static boolean matchChecksum(long checksum, InputStream fromAplace, int buffer) throws IOException {
    return checksum == createChecksum(fromAplace, buffer);
    }
}
