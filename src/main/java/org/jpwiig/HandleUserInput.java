package org.jpwiig;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class HandleUserInput {
    private Scanner scanner;

    public HandleUserInput() {
        scanner = new Scanner(System.in);
    }
    private checksum checksum = new checksum();
    public void startprogram(HandleUserInput userInput) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        System.out.println("What do want to do?");
        printOptions();
        String input = scanner.nextLine();
         if (input.equals("meow")) {
             easterEgg();
         }
         if (input.equals("2")){
             System.out.println("Please write inn your hash");
             String innHash = scanner.nextLine();
             returnHash(innHash);


         }
        if (input.equals("1")) {
            System.out.println("Sends you to the hellish deeps of checksum checking");

        }
       if (input.equals("0")) {
            System.exit(0);
        }

    }

    public void printOptions(){
        System.out.println("2: Have some fun with hashes");
        System.out.println("1: Go to the deepeste depth of file checksums");
        System.out.println("0: Exit the program");
    }
    public void easterEgg(){
        System.out.println("here kitty... kitty...");
    }
    public void returnHash(String hash) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        System.out.println(checksum.returnHash(hash));
    }
}
