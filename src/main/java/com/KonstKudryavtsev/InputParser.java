package com.KonstKudryavtsev;

public class InputParser {
    public static Double tryParse(String m) throws IllegalArgumentException {
        double parsedDouble;

        try {
            parsedDouble = Double.parseDouble(m);
        } catch (NumberFormatException e){
            System.out.println("Please, run the program with correct arguments!");
            throw new IllegalArgumentException();
        }
        return parsedDouble;
    }
}
