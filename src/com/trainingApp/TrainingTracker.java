package com.trainingApp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainingTracker {

    File fileCreator = new File("");

    public static void main(String[] args) {
        int userSelected;
        do{
            userSelected = MenuData();
            switch(userSelected){
                case 1:
                    System.out.println("Chest--1");
                    break;
                case 2:
                    System.out.println("Back--2");
                    break;
                case 3:
                    System.out.println("Legs--3");
                    break;
                case 4:
                    System.out.println("Shoulders--4");
                    break;
                case 5:
                    System.out.println("Arms--5");
                    break;
                default:
                    break;
            }
        }
        while(userSelected > 5);
    }


    public static int MenuData() {
        int selection;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What are you training today?");
        System.out.println("----------------------------\n");
        System.out.println("Chest -1");
        System.out.println("Back -2");
        System.out.println("Legs -3");
        System.out.println("Shoulders -4");
        System.out.println("Arms -5");

        System.out.println("You selected body part number: ");
        selection = scanner.nextInt();
        return selection;
    }

    public static void printer(){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Output.txt"));
            bufferedWriter.write("Saving to a file");
            bufferedWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}

