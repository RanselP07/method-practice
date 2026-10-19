package com.pluralsight;

public class Menu {

    public static String displayMenu() {
        return """
                === MENU ===
                1. Coffee - $3.99
                2. Tea - $2.99
                3. Cookie - $1.99""";
    }

    static void main(String[] args) {

        System.out.println("First call:");
        System.out.println(displayMenu());

        System.out.println("Second call:");
        System.out.println(displayMenu());
    }
}
