package com.KonstKudryavtsev;

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
        double b = tryParse(args[1]);
        double c = tryParse(args[2]);

        SquareEquationCalculator.calculateAndPrint(a, b, c);
    }

    protected static Double tryParse(String m) {
        double parsedDouble = 0.0;

        try {
            parsedDouble = Double.parseDouble(m);
        } catch (NumberFormatException e){
            System.out.println("Please, run the program with correct arguments!");
            System.exit(-1);
        }
        return parsedDouble;
    }
}
