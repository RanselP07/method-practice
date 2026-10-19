package com.pluralsight;

public class Hello {

    public static String sayHello() {
        return "Hello, World!";
    }

    public static String sayGoodbye() {
        return "Goodbye!";
    }

    public static String sayGoodMorning() {
        return "Good Morning!";
    }

    static void main(String[] args) {
        System.out.println(sayHello());

        System.out.println(sayGoodbye());

        System.out.println(sayGoodMorning());
    }
}
