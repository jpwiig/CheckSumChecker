package org.jpwiig;

import javax.xml.bind.DatatypeConverter;
import javax.xml.datatype.DatatypeConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
    public String returnHash(String value) throws UnsupportedEncodingException, NoSuchAlgorithmException {

        byte [] valueBytes = value.getBytes("UTF-8");
        MessageDigest digest = MessageDigest.getInstance("MD5");
        byte [] dgst = digest.digest(valueBytes);
        String vlue = DatatypeConverter.printHexBinary(dgst).toLowerCase();
        return vlue;
    }
}
