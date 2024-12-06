package org.jpwiig;

import javax.swing.*;
import java.util.Scanner;

public class HandleUserInput {
    private Scanner scanner;

    public HandleUserInput() {
        scanner = new Scanner(System.in);
    }

    public void startprogram(){
        System.out.println("What do want to do?");
        printOptions();
        String input = scanner.nextLine();
         if (input.equals("meow")) {
             easterEgg();
         }
        if (input.equals("1")) {
            System.out.println("Sends you to the hellish deeps of checksum checking");

        }
       if (input.equals("0")) {
            System.exit(0);
        }

    }

    public void printOptions(){

        System.out.println("1: Go to the deepeste depth of file checksums");
        System.out.println("0: Exit the program");
    }
    public void easterEgg(){
        System.out.println("here kitty... kitty...");
    }
}
