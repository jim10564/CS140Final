*Version 2020-Summer-1.0, Revised 11 June 2020*
### *CS-140 AL &mdash; Summer I 2020*

# Project 5 - Magic Squares

## Objectives

The objective of this project is to have students practice with two-dimensional arrays and loops. 

## Specifications

In this project, you will write code to determine if a two-dimensional array of `ints` is a Magic Square. For a two-dimensional array of `ints` to be a Magic Square all of the following must be true:

1. The array must be square - in other words, the lengths of all rows and all columns must be the same.
2. The array must contain all integers from 1 to n*n, where n is the length of the rows and columns.
3. The sum of the numbers in each diagonal, each row, and each column must be the same.

You have been given two classes:

* `MagicSquareTest.java` - contains JUnit test cases for the `MagicSquare` class. Your code must pass all these tests.
* `MagicSquare.java` - contains static methods to determine if a two-dimensional array of `ints` is a Magic Square:
	* `isMagicSquare()` - returns `true` if a two-dimensional array of ints meets all the criteria to be a Magic Square. This method is already completed for you. It uses all of the following methods:
		* `isSquare()` - returns `true` if a two-dimensional array of `ints` is a square - in other words, the lengths of all rows and columns are the same. This method is already completed for you.
		* `containsAllNumbers()` - returns `true` if a *square* two-dimensional array of `ints` contains all integers from 1 to n*n, where n is the length of the rows and columns. This method is already completed for you.
		* `diagonal1Sum()` - returns the sum of the numbers in the upper-left to lower-right diagonal of a *square* two-dimensional array of `ints`. **You must write the body for this method.** 	
		* `diagonal2Sum()` - returns the sum of the numbers in the upper-right to lower-left diagonal of a *square* two-dimensional array of `ints`. **You must write the body for this method.**
		* `rowSums()` - if all the rows  of a *square* two-dimensional array of `ints` have the same sum, returns that sum. Otherwise, returns -1. **You must write the body for this method.** It uses the following:
			* `rowSum()` - returns the sum of the numbers in a given row. **You must write the body for this method.**
		* `colSums()` - if all the columns  of a *square* two-dimensional array of `ints` have the same sum, returns that sum. Otherwise, returns -1. **You must write the body for this method.** Uses:
			* `colSum()` - returns the sum of the numbers in a given column. **You must write the body for this method.**
 	 
### This is an Individual Assignment - No Partners

As this is a Project (and not a Lab) you will be working on your own, not with a partner. You should not be sharing your code with anyone else, other than the instructor.  

You will need to fork your own private Project4 repository on GitLab for this project. The only person who should have any access to your repository is your instructor.  

You can ask questions on Piazza about setting up your repository on GitLab, about using Git to send code to the instructor, and general questions about how to write your code. However you should not be posting sections of code and asking others to find your errors. 

## Deliverables

Add your name as an author in `MagicSquare.java. Be sure that you have indented consistently.
 
The instructor will pull your Project5 from your GitLab repository to grade it. Make sure:
 
1. You have pushed all changes to your shared repository. (I can’t access local changes on your computer.)  
2. You have added your instructor as Maintainer to your shared GitLab repository.  

## Due Date/Time

Your project must be pushed to GitLab by Saturday, 27 June 2020 at 11:59pm. 
	
## Copyright and License
#### &copy;2020 Karl R. Wurst and Aparna Mahadev, Worcester State University

<img src="http://mirrors.creativecommons.org/presskit/buttons/88x31/png/by-sa.png" width=100px/>This work is licensed under the Creative Commons Attribution-ShareAlike 4.0 International License. To view a copy of this license, visit <a href="http://creativecommons.org/licenses/by-sa/4.0/" target="_blank">http://creativecommons.org/licenses/by-sa/4.0/</a> or send a letter to Creative Commons, 444 Castro Street, Suite 900, Mountain View, California, 94041, USA.