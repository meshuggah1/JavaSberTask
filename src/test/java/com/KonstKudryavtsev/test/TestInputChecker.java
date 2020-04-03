package com.KonstKudryavtsev.test;

import com.KonstKudryavtsev.InputChecker;
import com.KonstKudryavtsev.InputParser;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestInputChecker {
    @Test
    public void testArgsLengthChecker() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        String []testStr = {"", "qwe"};
        try {
                InputChecker.checkArgsLength(testStr);
        }catch (IllegalArgumentException ignored){}

        Assert.assertTrue(outputStream.toString().contains("Please, run the program with 3 numbers separated by spaces!"));

        outputStream.reset();

        String []testStr2 = {"123", "", "456", "dagt", "\n"};
        try {
            InputChecker.checkArgsLength(testStr2);
        }catch (IllegalArgumentException ignored){}

        Assert.assertTrue(outputStream.toString().contains("Please, run the program with 3 numbers separated by spaces!"));

        outputStream.reset();

        String []testStr3 = {"123", "0", "-456"};
        try {
            InputChecker.checkArgsLength(testStr3);
        }catch (IllegalArgumentException ignored){}

        Assert.assertFalse(outputStream.toString().contains("Please, run the program with 3 numbers separated by spaces!"));
    }

    @Test
    public void testAZeroChecker() {

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        String testStr = "0.0";
        try {
            InputChecker.checkIfZero(InputParser.tryParse(testStr));
        }catch (IllegalArgumentException ignored){}

        Assert.assertTrue(outputStream.toString().contains("'a' can't be zero!"));

        outputStream.reset();

        testStr = "1";
        try {
            InputChecker.checkIfZero(InputParser.tryParse(testStr));
        }catch (IllegalArgumentException ignored){}

        Assert.assertFalse(outputStream.toString().contains("'a' can't be zero!"));
    }

}
