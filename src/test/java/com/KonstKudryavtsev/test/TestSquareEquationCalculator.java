package com.KonstKudryavtsev.test;

import com.KonstKudryavtsev.SquareEquationCalculator;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestSquareEquationCalculator {

    @org.junit.Test
    public void testSimple() {

        double []arr = SquareEquationCalculator.calculate(1, -2, -3);

        Assert.assertTrue(Double.toString(arr[0]).contains("3.0"));
        Assert.assertTrue(Double.toString(arr[1]).contains("-1.0"));
    }

    @org.junit.Test
    public void testRationalNUmberInput() {

        double []arr = SquareEquationCalculator.calculate(-1, -2.2, 4);

        Assert.assertTrue(Double.toString(arr[0]).contains("-3.38"));
        Assert.assertTrue(Double.toString(arr[1]).contains("1.18"));
    }

    @org.junit.Test
    public void testWithDEqualToZero() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        try {
            double []arr = SquareEquationCalculator.calculate(1, 0, 1);
        } catch (IllegalArgumentException ignored){}

        Assert.assertTrue(outputStream.toString().contains("There are no solutions in real numbers for this one!"));

        outputStream.reset();

        try {
            double []arr = SquareEquationCalculator.calculate(-1, 0, -4);
        } catch (IllegalArgumentException ignored){}

        Assert.assertTrue(outputStream.toString().contains("There are no solutions in real numbers for this one!"));
    }
}
