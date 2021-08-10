Capstone Project

My initial idea for my project was to make something I could use in the future, so I decided to make a tracking app that
would allow you to track your workout for the day and to be able to save the files to keep record of any progress you make.
The console will ask you how many reps, sets, weight used, the exercise and what body
part was trained. You will then be able to keep track of any progress you
make and keep them on file. I try to keep track of my progress when it comes to lifting, but I struggle having to write everything down
on pieces of paper and then storing it all. Having to look through finding specific dates but
with this app you can easily store all progress into a file and keep those files forever without being worried to 
lose them. It's much more convenient, and it is fun to use.

The target audience would be for anybody who trains, no matter how consistently or how hard you train, It's good to keep progress.
You always want to know if you are making progress or at a plateau so keeping your progression
stored is very valuable. This way you can change things if something is not working well, or
you are not seeing any progress with your lifts.

List of features:
- Prints to a file the exercise you did so you can save it.
- Helps know if you are making progress or not.
- Tells you at the end how many reps in total you are doing, "reps X sets".
- Prints out the date of the workout, so you know what day you did the exercise and how long progression took.

Implementation plan:
- Firstly I want to start off simple, get something printed to the console.
- I then want to start building variables, making setters and getters and a constructor.
- Taking care of the local date method is also something I want to finish as once that has been completed I have full freedom with how I want to use it.
- Up next, I want to start asking users questions, what exercise they did, how much weight they used ect.
- Then I can take the users input, get their response to the questions and print it out to the console.
- After I successfully have this printed out to the console I want to give the total amount of reps, I would do this by multiplying reps x sets.
- Once all output is perfect and just how I want it, im going to make the function that prints all console output to a text file within the project.
- I will then add tests, find any room for Exceptions and clean up my project.
- I can always expand on this, I have other ideas to add like a calorie tracker but that will come in the future.

I am starting off with making my three classes named "Main", "TrainingExercises" and "TrainingTracker". The main
will be for calling methods, I will have TrainingExercises for my variables and getters and setters adn the
TrainingTracker will be where I make most of my methods and other objects.

On line 11 in TrainingTracker I used the localDate import to retrieve the local date. I did this, so we know when
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

I've updated my Main and TrainingExercises, I got a few things to print to the console but am unable to interact with it.
At first, I started off with TrainingTracker and tried to rush through with what I knew, but I took a step back, went and had a look at the main
and the TrainingExercises class and did what I could there. I updated names, added a few lines that I missed and my application
started running how I wanted. Now im going to work out the date and time function, so you know the date of the workout. I will need to print it
to the console first.

After I get everything printed to the console, I will start to figure out how to print it all to a savable file. After I work that problem out
I will think about adding a calorie tracker, or perhaps just a meal tracker. This way you can remember the meals you had on the day of the
training session and it will be able to help you keep a steady diet. That idea is not set in stone and may make a few tweaks to it but right now 
I am hoping to be able to get that done.

I wanted to add a menu for the body parts you could train, so I made one in TrainingTracker. This used breaks. This gives the user 5 options on which body part to train.
The reason I asked the user this twice is that sometimes when doing one exercise you are training more than just the targeted body part.
For example, when you are bench pressing you would do that on a chest day, but bench pressing works the chest, front deltoid and the triceps.

I am looking at putting in some IO exceptions if I see fit but am not sure where they will go yet. Always good to have a 
back-up plan in the app if something goes wrong.