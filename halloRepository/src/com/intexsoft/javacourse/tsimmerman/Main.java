package com.intexsoft.javacourse.tsimmerman;

public class Main {
    public static void main(String[] args) {
        Main.say();
    }

    private static void say() {
        System.out.println("Hello World!");
        Main main = new Main();
        System.out.println(main.toString());
    }

    @Override
    public String toString() {
        return "Hallo Repository";
    }

}
