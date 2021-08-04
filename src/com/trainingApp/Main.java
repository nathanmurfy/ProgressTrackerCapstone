package com.trainingApp;

public class Main {

    public static void main(String[] args) {

	System.out.println("Welcome user!. This program helps track workout progress.");
	System.out.println("Please enter what exercise you are doing.");

	 TrainingExercises trainingExercise = new TrainingExercises();
	 trainingExercise.setExercise();

	 System.out.println("Please enter the weight you did.");

	 TrainingExercises weight = new TrainingExercises();
	 weight.setWeight();

	 System.out.println("Please enter the amount reps you did.");

	 TrainingExercises reps = new TrainingExercises();
	 reps.setReps();

	 System.out.println("Please enter how many sets you did.");

	 TrainingExercises sets = new TrainingExercises();
	 sets.setSets();


    }

}
