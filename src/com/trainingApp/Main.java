package com.trainingApp;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static com.trainingApp.TrainingTracker.DateAndTime;
import static com.trainingApp.TrainingTracker.MenuData;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
		TrainingExercises trainingExercises = new TrainingExercises();

		DateAndTime();
    	MenuData();
	System.out.println("Welcome user!. This program helps track workout progress.");
	System.out.println("Please enter what exercise you are doing: ");
	trainingExercises.setExercise(sc.nextLine());
	System.out.println("Please enter the weight: ");
	trainingExercises.setWeight(sc.nextLine());
	System.out.println("Please enter how many reps: ");
	trainingExercises.setReps(sc.nextLine());
	System.out.println("Enter how many sets: ");
	trainingExercises.setSets(sc.nextLine());

	String output = "";
	int reps = Integer.parseInt(trainingExercises.getReps());
	int sets = Integer.parseInt(trainingExercises.getSets());
	output += "The exercise you did was: " + trainingExercises.getExercise() + "\n";
	output += "You weight you did was: " + trainingExercises.getWeight() + " KG" + "\n";
	output += "You amount of reps you did was: " + reps + " reps" + "\n";
	output += "The amount of sets you did was: " + sets + " sets" + "\n";
	output += "The total amount was: " + reps * sets + " reps" + "\n";

	System.out.println(output);

	try {
		System.out.println(TrainingTracker.printer(output));
	} catch (Exception e){
		System.out.println("error printing to file");
		System.out.println("error was: " + e.getMessage());
	}


    }


}
