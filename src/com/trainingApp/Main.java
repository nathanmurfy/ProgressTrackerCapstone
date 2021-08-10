package com.trainingApp;

import java.util.Scanner;
import static com.trainingApp.TrainingTracker.DateAndTime;
import static com.trainingApp.TrainingTracker.MenuData;

public class Main {

    public static void main(String[] args) {

        // Starting the scanner
        Scanner sc = new Scanner(System.in);

        // Initializing trainingExercises
        TrainingExercises trainingExercises = new TrainingExercises();

        // Calling the DateAndTime and the MenuData class
        DateAndTime();
        MenuData();

        // Asking the user for input
        System.out.println("Welcome user!. This program helps track workout progress.");
        System.out.println("Please enter what exercise you are doing: ");
        trainingExercises.setExercise(sc.nextLine());
        System.out.println("Please enter the weight: ");
        trainingExercises.setWeight(sc.nextLine());
        System.out.println("Please enter how many reps: ");
        trainingExercises.setReps(sc.nextLine());
        System.out.println("Enter how many sets: ");
        trainingExercises.setSets(sc.nextLine());

        // Initialising all console output to the "output" String
        String output = "";

        // Passing reps and sets as an int
        int reps = Integer.parseInt(trainingExercises.getReps());
        int sets = Integer.parseInt(trainingExercises.getSets());

        // Output into the console
        output += "The exercise you did was: " + trainingExercises.getExercise() + "\n";
        output += "You weight you did was: " + trainingExercises.getWeight() + " KG" + "\n";
        output += "You amount of reps you did was: " + reps + " reps" + "\n";
        output += "The amount of sets you did was: " + sets + " sets" + "\n";
        output += "The total amount was: " + reps * sets + " reps" + "\n";

        System.out.println(output);

        // Printing to console if the output successfully printed to the file
        try {
            System.out.println(TrainingTracker.printer(output));
        } catch (Exception e) {
            System.out.println("error printing to file");
            System.out.println("error was: " + e.getMessage());
        }


    }


}
