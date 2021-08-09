package com.trainingApp;

public class TrainingExercises {

    String exercise;
    String weight;
    int weightAsInt;
    String reps;
    int repsAsInt;
    String sets;
    int setsAsInt;
    String bodyPart;

    public TrainingExercises(String exercise, String weight, int weightAsInt, String reps, int repsAsInt, String sets, int setsAsInt, String bodyPart) {
        this.exercise = exercise;
        this.weight = weight;
        this.weightAsInt = weightAsInt;
        this.reps = reps;
        this.repsAsInt = repsAsInt;
        this.sets = sets;
        this.setsAsInt = setsAsInt;
        this.bodyPart = bodyPart;
    }

    public TrainingExercises() {

    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getWeightAsInt() {
        return weightAsInt;
    }

    public void setWeightAsInt(int weightAsInt) {
        this.weightAsInt = weightAsInt;
    }

    public String getReps() {
        return reps;
    }

    public void setReps(String reps) {
        this.reps = reps;
    }

    public int getRepsAsInt() {
        return repsAsInt;
    }

    public void setRepsAsInt(int repsAsInt) {
        this.repsAsInt = repsAsInt;
    }

    public String getSets() {
        return sets;
    }

    public void setSets(String sets) {
        this.sets = sets;
    }

    public int getSetsAsInt() {
        return setsAsInt;
    }

    public void setSetsAsInt(int setsAsInt) {
        this.setsAsInt = setsAsInt;
    }

    public String getBodyPart() {
        return bodyPart;
    }

    public void setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }
}
