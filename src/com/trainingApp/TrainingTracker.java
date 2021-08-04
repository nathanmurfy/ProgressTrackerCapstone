package com.trainingApp;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainingTracker {

    File fileCreator = new File("");
    Scanner scanner = new Scanner(System.in);

    private LocalDate localDate = LocalDate.now();

    public TrainingTracker(File fileCreator, Scanner scanner, LocalDate localDate, DateTimeFormatter dateTimeFormatter, String currentDate) {
        this.fileCreator = fileCreator;
        this.scanner = scanner;
        this.localDate = localDate;
        this.dateTimeFormatter = dateTimeFormatter;
        this.currentDate = currentDate;
    }

    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
    private String currentDate = localDate.format(dateTimeFormatter);

    public void ListOfExercises() {
        List<String> exerciseList = new ArrayList<>();

        // LEGS
        exerciseList.add("Dead Lift");exerciseList.add("Squat");
        exerciseList.add("Leg Extensions");exerciseList.add("Leg Press");
        exerciseList.add("Hamstring Curls");exerciseList.add("Romanian Dead Lifts");
        exerciseList.add("Bulgarian Split Squats");exerciseList.add("Hamstring Extension");

        // CHEST
        exerciseList.add("Bench Press");exerciseList.add("Flat Dumbbell Press");
        exerciseList.add("Incline Dumbbell Press");exerciseList.add("Pec Flies");
        exerciseList.add("Landmine Chest Press");exerciseList.add("Machine Chest Press");
        exerciseList.add("Cable Flies");

        // BACK
        exerciseList.add("Dumbbell Rows");exerciseList.add("Barbell Rows");
        exerciseList.add("VBar Landmine Rows");exerciseList.add("Dumbbell Pull Overs");
        exerciseList.add("Lat Pull Downs");exerciseList.add("Cable Rows");
        exerciseList.add("Incline Bench Rows");exerciseList.add("Cable Rope Lat Pull Downs");

        // SHOULDERS
        exerciseList.add("Dumbbell Lateral Raises");exerciseList.add("Military Press");
        exerciseList.add("Reverse Pec Deck");exerciseList.add("Dumbbell Front Raises");
        exerciseList.add("Dumbbell Press");exerciseList.add("Cable Lateral Raises");

        // TRICEPS
        exerciseList.add("Tricep Push Downs");exerciseList.add("Over Head Dumbbell tricep Extension");
        exerciseList.add("Over Head Barbell tricep Extension");exerciseList.add("Close Grip Bench Press");

        // BICEPS
        exerciseList.add("Dumbbell curls");exerciseList.add("Strict Dumbbell curls");
        exerciseList.add("Rope Curls");exerciseList.add("21s");
        exerciseList.add("Reverse Grip Curls");exerciseList.add("Preacher Curls");

    }

}

