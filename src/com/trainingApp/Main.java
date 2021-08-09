package com.trainingApp;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

import static com.trainingApp.TrainingTracker.MenuData;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
		TrainingExercises trainingExercises = new TrainingExercises();



    	LocalDate localDate = LocalDate.now();
    	System.out.println(localDate);

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

	System.out.println("The exercise you did was: " + trainingExercises.getExercise());
	System.out.println("You weight you did was: " + trainingExercises.getWeight() + " KG");
	System.out.println("You amount of reps you did was: " + trainingExercises.getReps() + " reps");
	System.out.println("The amount of sets you did was: " + trainingExercises.getSets() + " sets");





    }


}
