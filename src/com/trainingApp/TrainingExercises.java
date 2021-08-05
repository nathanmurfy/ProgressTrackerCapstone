package com.trainingApp;

public class TrainingExercises {
    private String exercise;
    private int weight;
    private int reps;
    private int sets;
    private String bodyPart;

    TrainingExercises(){
        exercise = "New exercise";
        weight = 0;
        reps = 0;
        sets = 0;
        bodyPart = "Arms";
    }
    TrainingExercises(String exercise, int weight, int reps, int sets, String bodyPart){
        this.exercise = exercise;
        this.weight = weight;
        this.reps = reps;
        this.sets = sets;
        this.bodyPart = bodyPart;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public String getBodyPart() {
        return bodyPart;
    }

    public void setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

}
