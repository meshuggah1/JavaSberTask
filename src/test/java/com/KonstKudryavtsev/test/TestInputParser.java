package com.KonstKudryavtsev.test;

import com.KonstKudryavtsev.InputParser;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestInputParser {

    @Test
    public void testDifferentInputStrings() {
        String []strArr = new String[6];
        strArr[0] = "123";
        strArr[1] = "4.4";
        strArr[2] = "0.0";
        strArr[3] = "-0.0";
        strArr[4] = ".2";   // в задании не сказано, считается ли такой ввод корректным, но по дефолту это парсится
        strArr[5] = "5.f";  // в задании не сказано, считается ли такой ввод корректным, но по дефолту это парсится


        double []doubleArr = new double[6];

        for (int i = 0; i < strArr.length; i++) {
            doubleArr[i] = InputParser.tryParse(strArr[i]);
        }

        Assert.assertEquals(123.0, doubleArr[0], 0);
        Assert.assertEquals(4.4, doubleArr[1], 0);
        Assert.assertEquals(0.0, doubleArr[2], 0);
        Assert.assertEquals(-0.0, doubleArr[3], 0);
        Assert.assertEquals(0.2, doubleArr[4], 0);
        Assert.assertEquals(5.0, doubleArr[5], 0);

    }

    @Test
    public void testIncorrectInput() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        String testStr = "-5.0L";
        try {
            double resultStr = InputParser.tryParse(testStr);
        }catch (IllegalArgumentException ignored){}

        Assert.assertTrue(outputStream.toString().contains("Please, run the program with correct arguments!"));

        outputStream.reset();

        String testStr2 = "99 88";
        try {
            double resultStr = InputParser.tryParse(testStr2);
        }catch (IllegalArgumentException e){}

        Assert.assertTrue(outputStream.toString().contains("Please, run the program with correct arguments!"));
    }
}
