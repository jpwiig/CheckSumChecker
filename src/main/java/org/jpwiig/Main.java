package org.jpwiig;


import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
//small program that checks the checksum for a program
        HandleUserInput userInput = new HandleUserInput();
        userInput.startprogram(userInput);
    }
}