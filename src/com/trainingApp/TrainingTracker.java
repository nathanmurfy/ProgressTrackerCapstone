package com.trainingApp;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TrainingTracker {

    File fileCreator = new File("");

    private LocalDate localDate = LocalDate.now();

    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
    private String currentDate = localDate.format(dateTimeFormatter);

    public void ListOfExercises() {
        List<String> exerciseList = new ArrayList<>();

    }
}

