package com.pluralsight;

import java.util.Scanner;

public class Format {

    static Scanner myScanner = new Scanner(System.in);

    public static String formatName (String first, String last){

        return last + " " + first;

    }

    static void main(String[] args) {

        String first;
        String last;

        System.out.print("First Name: ");
        first = myScanner.nextLine();

        System.out.print("Last Name: ");
        last = myScanner.nextLine();

        System.out.print(formatName(first, last));
    }
}
