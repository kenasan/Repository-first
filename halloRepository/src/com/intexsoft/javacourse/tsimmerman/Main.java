package com.intexsoft.javacourse.tsimmerman;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.toString());
        System.out.println(main.hashCode());
        int i = 5;
        long sum = i + i;
        System.out.println(sum);
    }

    @Override
    public String toString() {
        return "Hallo Repository";
    }
}
