package com.trainingApp;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

import static com.trainingApp.TrainingTracker.MenuData;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

    	LocalDate localDate = LocalDate.now();
    	System.out.println(localDate);

    	MenuData();
	System.out.println("Welcome user!. This program helps track workout progress.");
	System.out.println("Please enter what exercise you are doing.");

	TrainingExercises liftSession;
    liftSession = newTrainingSession();

	System.out.println("The exercise you did was: " + liftSession.getExercise());
	System.out.println("The weight you did was: " + liftSession.getWeight());
	System.out.println("The amount of reps you did were: " + liftSession.getReps());
	System.out.println("The amount of sets you did was: " + liftSession.getSets());
	System.out.println("The body part you trained was: " + liftSession.getBodyPart());

	System.out.println("In total you did " +  " reps.");



    }

    public static TrainingExercises newTrainingSession(){
    	Scanner scanner = new Scanner(System.in);
    	String exercise;
    	String weight;
    	int weightAsInt;
    	String reps;
    	int repsAsInt;
    	String sets;
    	int setsAsInt;
    	String bodyPart;

    	System.out.println("Enter Exercise: ");
    	exercise = scanner.nextLine();
    	System.out.println("Enter weight: ");
    	weight = scanner.nextLine();
    	System.out.println("Enter reps: ");
    	reps = scanner.nextLine();
    	System.out.println("Enter sets: ");
    	sets = scanner.nextLine();
    	System.out.println("Enter body part trained: ");
    	bodyPart = scanner.nextLine();


    	weightAsInt = Integer.parseInt(weight);
    	repsAsInt = Integer.parseInt(reps);
    	setsAsInt = Integer.parseInt(sets);

//		TrainingExercises tempResult=new TrainingExercises();
//		tempResult.setSets(setsAsInt);
//		tempResult.setReps(repsAsInt);
//		tempResult.setBodyPart(bodyPart);
//		tempResult.setWeight(weightAsInt);
//		tempResult.setExercise(exercise);
//		return tempResult;

    	return new TrainingExercises(exercise,weightAsInt,repsAsInt,setsAsInt,bodyPart);
	}

}
