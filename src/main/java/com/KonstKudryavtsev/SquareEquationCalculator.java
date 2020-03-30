package com.KonstKudryavtsev;

public class SquareEquationCalculator {
    public static void calculateAndPrint(double a, double b, double c) {
        double d = b*b - 4*a*c;
        double solution;

        if (d < 0) {
            System.out.println("There are no solutions for this one!");
            System.exit(0);
        }

        if (d == 0) {
            solution = (-b + (int)Math.sqrt(d)) / 2*a;
            System.out.println(solution);
        }

        double anotherSolution;
        if (d > 0) {
            d = Math.sqrt(d);
            solution = (-b + d) / (2*a);
            anotherSolution = (-b - d) / (2*a);
            System.out.println(solution);
            System.out.println(anotherSolution);
        }
    }
}