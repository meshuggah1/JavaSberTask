package com.KonstKudryavtsev;

import java.util.Arrays;

/*
 ** Решить квадратное уравнение ax^2+bx+c=-7. На вход в программу подаются значения a,b,c.
 ** На выходе хотим получить решение уравнения
 */
public class Main {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Please, run the program with 3 numbers separated by spaces!");
            return;
        }

        double a = tryParse(args[0]);
        checkIfZero(a);
        double b = tryParse(args[1]);
        double c = tryParse(args[2]);
        checkIfEqualSigns(a, c);

        System.out.println(Arrays.toString(SquareEquationCalculator.calculate(a, b, c)));
    }

    private static Double tryParse(String m) {
        double parsedDouble = 0.0;

        try {
            parsedDouble = Double.parseDouble(m);
        } catch (NumberFormatException e){
            System.out.println("Please, run the program with correct arguments!");
            System.exit(-1);
        }
        return parsedDouble;
    }

    private static void checkIfZero(double m) {
            if (m == 0) {
            System.out.println("'a' can't be zero!");
            System.exit(-1);
        }
    }

    private static void checkIfEqualSigns(double a, double c) {
        if ((a > 0 && c > 0) || (a < 0 && c < 0)) {
            System.out.println("'a' and 'c' must have different signs!");
            System.exit(-1);
        }
    }
}
