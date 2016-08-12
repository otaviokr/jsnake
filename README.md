# JSnake

## The Snake game, implemented in Java

### Overview

This project is a very simple Snake game implemented in Java. While the game is working - and it is pretty funny too - its main goal
is actually to use it as a base for a Git/Github tutorial. You may think that some of the branches and the chain of events are a little
strange; you may be right, but keep in mind that the development is not the ultimate goal here. Lots of branches and ackward timing
means more conflicts, more merging and more playfulness with Git.

For that reason, Pull Requests are expected to enhance the learning experience, not the program itself. If you want to contribute, I
kindly ask to check with me before.

### Installation

If you just want to compile and run the code, the game branch will always contain the last iteration. Just compile it like usual
and run it!

### How to learn with this project

### The iterations

Each iteration is a stage of development, with its own new files, refactorings and conflicts and is represented as an unmerged branch.
The idea is not to just blindly copy each iteration, but rather use it as a guideline and a help in case of bugs or blocks. The ideal
is just follow the paths describe next and write your own code. But, if you need some help, all iterations are tagged in the
repository; just go to the correct branch and move the HEAD to the right tag. You can check if you are in the right commit by
checking this file; each step in each iteration will be checked as we are finishing it - if the step you want is not the last checked
in the list, you should move back or advance some commits.

Feel free to commit more often than suggested, add your own tags or create your own features. You may run into interesting scenarios
that will surely improve your experience.

Having more than one person pushing to the same repository will create some extra scenarios to learn Pull Requests and conflicts.
There are many activities that can be done independently. Try have everyone interacting with each other's code. To keep things simple,
however, this is not in the scope of this project (for now!).

#### Iteration 00 - Setup
	- [x] Create the repository

		To create a new repository, just create the root folder with the name of the project and the extension `.git`. For example,
		I could `/var/git/repos/jsnake.git`. Now, enter that folder and run `git init --bare`. That's it! Notice that you're not
		supposed to work directly in this folder; any change you want to make to the files, must be done in a working copy
		(the next step).

	- [x] Clone the repository

		To clone the repository, creating a working copy where you can, well, work, is a single command. Enter the parent folder where
		you want to keep your working copy and run `git clone /var/git/repos/jsnake.git`. Of course, your path will be different than
		mine, but the rest is the same. Remember that this will be also the path of your Java project in Eclipse, so you might want to
		clone the repository directly into your workspace folder.

	- [x] Create the project in Eclipse

		Open Eclipse and go to `File -> Import... -> Project from Git`. Select `Existing repository` and open the folder you cloned in
		the previous step.

#### Iteration 01 - Window spotted
	- [x] Create the JFrame, with a title

		The JFrame is the class that defines the windows where we can present the game. Very simple, but we are just getting started!

#### Iteration 02 - Hey, a snake!
	- [x] Create branch snake from master

		To create a branch, you just have to be in the branch that you want to be the parent branch and run
		`git checkout -b my-new-branch-name. To switch between branches, run `git checkout my-other-branch-name` - without
		the -b option!

	- [x] Add the snake to JFrame

		First, let's create our version of a JPanel so we can control the painting methods to say what, where and when we want to
		paint. Inside of eat, we pick a color and then draw a filled rectangle (filled with the color previously chose).
		Now, you have to add a new object of this JPanel extended class you created to the JFrame.

	- [x] Make the snake walk (don't worry about its size for now)

		Like the animation principle, to have the snake moving around it just mean to draw a picture where the snake is at (x, y)
		and the draw another picture where it is at (x+a, y+b). So we need some kind of loop, where the image will be drawn at each
		iteration, and the snake will be in a different position.

		We could use a loop-while or loop-for, but those are too fast and we would need to put threads to sleep and other controls;
		instead, we will activate a timer, and when the time runs out, the screen will update itself and also update the snake
		coordinates. The speed and direction is not important for now.

#### Iteration 03 - The snake bows to my will
	- [x] Create branch user-commands from snake

	- [x] Handle user commands

		The user need to be able to press a key and change the direction of the snake. To accomplish that, we make the class a Key
		Listener and make the JFrame listen to key events.

#### Iteration 04 - Bigger is better
	- [x] Move back to branch snake

	- [x] Make the snake grows as it moves, but not more than 10 times

		This will be very useful when the apple feature is ready and the snake will grow as it eats them. The idea is just to
		keep the last 10 positions the snake had and draw them all.

#### Iteration 05 - An apple a day keeps the snake away!?
	- [x] Create branch apple from master

	- [x] Create the apple
		The apple is just a red square, for now. But, because we're branching from main, we'll need to create the extended
		class from JPanel again. You don't have to create the exactly same class - it is actually good if they are different
		because then we can practice the merging.

	- [x] Make it appears in a random position on screen

		Use the Random class to make the apple appear in a random position, because that's how the game works.

#### Iteration 06 - Why would a snake eat an apple?
	- [x] Merge branch user-commands to snake
	- [x] Merge branch snake to master
	- [x] Merge branch apple to master
	- [ ] Pull the updates from master to apple
	- [ ] Create routine to have the snake eating the apple
	- [ ] Merge to master
	- [ ] Pull the updates from master to snake
	- [ ] Create routine to have the snake growing as it eats the apple

#### Iteration 07 - Score!
	- [ ] Create branch score from snake
	- [ ] Whenever the snake eats an apple it gets 1 point
	- [ ] Display the current points on the top-left corner of the screen
	- [ ] EXTRA: Keep hi-score until the program is finished!

#### Iteration 08 - Let's put an end to this!
	- [ ] Create branch lose-criteria from master
	- [ ] If the snake hits any wall, you lose
	- [ ] If the snake hits itself, you lose
	- [ ] When you lose, the snake returns to size 1, in the original position with a resetted score

#### Iteration 09 - All become one
	- [ ] Merge everything back to master

#### Iteration 10 - Some eye-candies
	- [ ] Put texture to snake, apple and points

#### Extra-teration - Minor glitches and improvements
	- [ ] The apple cannot appear on the snake
	- [ ] Move the snake area away from the points
	- [ ] Put a nice screen "You lose", wait for the user to press a button to restart
	- [ ] Some sounds are nice: nom-nom-nom, game over, man!, some background music
	- [ ] Snake speeds up as it grows