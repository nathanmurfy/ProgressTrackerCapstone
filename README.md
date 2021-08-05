Capstone Project

My initial idea for my project was to make something i could use in the future, so i decided to make a tracking app that
would allow you to track your workout for the day and to be able to save the files to keep record of any progress you make.

I am starting off with making my three classes named "Main", "TrainingExercises" and "TrainingTracker". The main
will be for calling methods, I will have TrainingExercises for my variables and getters and setters adn the
TrainingTracker will be where I make most of my methods and other objects.

On line 11 in TrainingTracker I used the localDate import to retrieve the local date. I did this so we know when
exactly was the workout, and it makes the files easier to place in order. I then followed up the localDate import
with the DateTimeFormatter import. Here I set the default pattern of (mm / dd / yyyy) to (dd / mm / yyyy).
In this block of code I also made the variable "currentDate" carry the format I made with the current date.
I was not sure how to go about this so I found a few examples online. Took bits that fit my needs and created what I wanted.

Line 18 is where I am staring my class that will hold all my exercises. I have made an array list to hold all the
exercises and have split them into separate muscle groups. I am trying to think of a way to put them into separate Lists and
still be able to call them together, because you usually train more than one muscle group for the day.

In TrainingExercises.java I made my getters and setters. I also added
the body part category to see if I could do that as well.
I will be using the getters and setters in the main to retrieve the information from the user about what reps, sets, weights, body part
and the name of exercise they did.