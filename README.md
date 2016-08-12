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
	- [ ] Create the JFrame, with a title

#### Iteration 02 - Hey, a snake!
	- [ ] Create branch snake from master
	- [ ] Create the repaint function
	- [ ] Add the snake to JFrame
	- [ ] Make the snake walk (don't worry about its size for now)

#### Iteration 03 - The snake bows to my will
	- [ ] Create branch user-commands from snake
	- [ ] Handle user commands

#### Iteration 04 - We love only the tiny things
	- [ ] Move back to branch snake
	- [ ] Keep the snake size to only 1 "square"

#### Iteration 05 - An apple a day keeps the snake away!?
	- [ ] Create branch appel from master
	- [ ] Create the apple
	- [ ] Make it appears in a random position on screen

#### Iteration 06 - Why would a snake eat an apple?
	- [ ] Merge branch apple to master
	- [ ] Merge branch user-commands to snake
	- [ ] Merge branch snake to master
	- [ ] Pull the updates from master to apple
	- [ ] Create routine to have the snake eating the apple
	- [ ] Merge to master
	- [ ] Pull the updates from master to snake
	- [ ] Create routine to have the snake growing as it eats the apple

#### Iteration 06 - Score!
	- [ ] Create branch score from snake
	- [ ] Whenever the snake eats an apple it gets 1 point
	- [ ] Display the current points on the top-left corner of the screen
	- [ ] EXTRA: Keep hi-score until the program is finished!

#### Iteration 07 - Let's put an end to this!
	- [ ] Create branch lose-criteria from master
	- [ ] If the snake hits any wall, you lose
	- [ ] If the snake hits itself, you lose
	- [ ] When you lose, the snake returns to size 1, in the original position with a resetted score

#### Iteration 08 - All become one
	- [ ] Merge everything back to master

#### Iteration 09 - Some eye-candies
	- [ ] Put texture to snake, apple and points

#### Extra-teration - Minor glitches and improvements
	- [ ] The apple cannot appear on the snake
	- [ ] Move the snake area away from the points
	- [ ] Put a nice screen "You lose", wait for the user to press a button to restart
	- [ ] Some sounds are nice: nom-nom-nom, game over, man!, some background music
	- [ ] Snake speeds up as it grows