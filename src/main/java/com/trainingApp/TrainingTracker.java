package com.trainingApp;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TrainingTracker {

    File fileCreator = new File("");

    // Asking user what muscle group they are training
    public static int MenuData() {
        int selection;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What are you training today?");
        System.out.println("----------------------------\n");
        System.out.println("Chest - 1");
        System.out.println("Back - 2");
        System.out.println("Legs - 3");
        System.out.println("Shoulders - 4");
        System.out.println("Arms - 5");

        // Printing the body part they chose
        System.out.println("You selected body part number: ");
        selection = scanner.nextInt();
        return selection;
    }
    // Formatting the date and time
    public static void DateAndTime() {
        LocalDate localDate = LocalDate.now();
        // Changing the pattern to "dd, MONTH yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String formattedString = localDate.format(formatter);
        // Printing out the formatted date
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
    }
    // This class is printing to the Output.txt file
    public static String printer(String output) throws IOException {
        String filenameStr = "Output.txt";
        // Outputting the console output to the file
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Output.txt"));
        bufferedWriter.write(output);
        bufferedWriter.close();

        return filenameStr;
    }

}

