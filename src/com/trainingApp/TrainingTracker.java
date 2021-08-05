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
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
    private String currentDate = localDate.format(dateTimeFormatter);

    public TrainingTracker(File fileCreator, Scanner scanner, LocalDate localDate, DateTimeFormatter dateTimeFormatter, String currentDate) {
        this.fileCreator = fileCreator;
        this.scanner = scanner;
        this.localDate = localDate;
        this.dateTimeFormatter = dateTimeFormatter;
        this.currentDate = currentDate;
    }


    public void ListOfExercises() {

    }

}

