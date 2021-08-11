package com.trainingApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void getOutputTest() {
        String output = Main.getOutput(60, 3);
        assertTrue(output.contains("180"));
    }

    @Test
    public void getOutputTestWith0Reps() {
        String output = Main.getOutput(0, 3);
        assertTrue(output.contains("was: 0 reps"));
    }

//    @Test
//    public void checkingOutputTxtTest() {
//        String output = Main.extracted("error printing to file");
//        assertTrue(output.contains("Output.txt"));
//    }
}