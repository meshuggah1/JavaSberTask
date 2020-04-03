package com.KonstKudryavtsev.test;

import com.KonstKudryavtsev.SquareEquationCalculator;
import org.junit.Assert;

import java.io.IOException;

public class TestSquareEquationCalculator {

    @org.junit.Test
    public void testSimple() throws IOException {

        double []arr = SquareEquationCalculator.calculate(1, -2, -3);

        Assert.assertTrue(Double.toString(arr[0]).contains("3.0"));
        Assert.assertTrue(Double.toString(arr[1]).contains("-1.0"));
    }

    @org.junit.Test
    public void testRationalNUmberInput() throws IOException {

        double []arr = SquareEquationCalculator.calculate(-1, -2.2, 4);

        Assert.assertTrue(Double.toString(arr[0]).contains("-3.38"));
        Assert.assertTrue(Double.toString(arr[1]).contains("1.18"));
    }

}
