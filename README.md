Capstone Project

My inital idea for my project was to make something i could use in the future, so i decided to make a tracking app that
would allow you to track your workout for the day and to be able to save the files to keep record of any progress you make.

I am starting off with making my three classes named "Main", "TrainingExercises" and "TrainingTracker". The main
will be for calling methods, I will have TrainingExercises for my variables and getters and setters adn the
TrainingTracker will be where I make most of my methods and other objects.

On line 11 in TrainingTracker I used the localDate import to retrieve the local date. I did this so we know when
exactly was the workout, and it makes the files easier to place in order. I then followed up the localDate import
with the DateTimeFormatter import. Here I set the default pattern of (mm / dd / yyyy) to (dd / mm / yyyy).
In this block of code I also made the variable "currentDate" carry the format I made with the current date.