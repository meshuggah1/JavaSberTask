package com.KonstKudryavtsev;

public class InputChecker {

    public static void checkArgsLength(String []args) {
        if (args.length != 3) {
            System.out.println("Please, run the program with 3 numbers separated by spaces!");
            throw new IllegalArgumentException();
        }
    }

    public static void checkIfZero(double m) {
        if (m == 0) {
            System.out.println("'a' can't be zero!");
            throw new IllegalArgumentException();
        }
    }

}
