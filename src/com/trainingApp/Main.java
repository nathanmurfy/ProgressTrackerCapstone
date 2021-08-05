package com.trainingApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

	System.out.println("Welcome user!. This program helps track workout progress.");
	System.out.println("Please enter what exercise you are doing.");

	TrainingExercises liftSession = new TrainingExercises();

	System.out.println("The exercise you did was: " + liftSession.getExercise());
	System.out.println("The weight you did was: " + liftSession.getWeight());
	System.out.println("The amount of reps you did were: " + liftSession.getReps());
	System.out.println("The amount of sets you did was: " + liftSession.getSets());
	System.out.println("The body part you trained was: " + liftSession.getBodyPart());

    }

    public static TrainingExercises newTrainingSession(){
    	Scanner sc = new Scanner(System.in);
    	String exercise;
    	String weight;
    	int weightAsInt;
    	String reps;
    	int repsAsInt;
    	String sets;
    	int setsAsInt;
    	String bodyPart;
    	System.out.println("Enter Exercise: ");
    	exercise = sc.nextLine();
    	System.out.println("Enter weight: ");
    	weight = sc.nextLine();
    	System.out.println("Enter reps: ");
    	reps = sc.nextLine();
    	System.out.println("Enter sets: ");
    	sets = sc.nextLine();
    	System.out.println("Enter body part trained: ");
    	bodyPart = sc.nextLine();
    	weightAsInt = Integer.parseInt(weight);
    	repsAsInt = Integer.parseInt(reps);
    	setsAsInt = Integer.parseInt(sets);
    	return new TrainingExercises();
	}

}
