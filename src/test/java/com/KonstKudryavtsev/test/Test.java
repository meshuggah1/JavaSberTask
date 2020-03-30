package com.KonstKudryavtsev.test;

import com.KonstKudryavtsev.SquareEquationCalculator;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Test {

    @org.junit.Test
    public void testSimple() throws IOException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bo));

        SquareEquationCalculator.calculateAndPrint(1, -2, -3);

        bo.flush();
        String allWrittenLines = new String(bo.toByteArray());
        System.out.println(allWrittenLines);
        Assert.assertEquals(11, allWrittenLines.length());
        Assert.assertTrue(allWrittenLines.contains("3.0"));
        Assert.assertTrue(allWrittenLines.contains("-1.0"));

    }

    @org.junit.Test
    public void testRationalNUmberInput() throws IOException {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bo));

        SquareEquationCalculator.calculateAndPrint(-1, -2, 15);

        bo.flush();
        String allWrittenLines = new String(bo.toByteArray());
        System.out.println(allWrittenLines);
        Assert.assertEquals(11, allWrittenLines.length());
        Assert.assertTrue(allWrittenLines.contains("-5.0"));
        Assert.assertTrue(allWrittenLines.contains("3.0"));

    }

}
