package com.KonstKudryavtsev;

import java.util.Arrays;

/*
 ** Решить квадратное уравнение ax^2+bx+c=-7. На вход в программу подаются значения a,b,c.
 ** На выходе хотим получить решение уравнения
 */
public class Main {

    public static void main(String[] args) {

        InputChecker.checkArgsLength(args);

        double a = InputParser.tryParse(args[0]);
        InputChecker.checkIfZero(a);
        double b = InputParser.tryParse(args[1]);
        double c = InputParser.tryParse(args[2]);


        double []resultArr = (SquareEquationCalculator.calculate(a, b, c));
        if (resultArr != null) {
            System.out.println(Arrays.toString(resultArr));
        }
    }
}
