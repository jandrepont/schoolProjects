Joel Andrepont
jaandrepont@uno.edu
CSCI 2125 UNO Fall 2016

Singly Linked List:
	Was not sure how to intialize a tail node so I just did without. My 1st program has lots of getter and setter methods but I
	scrapped that and started over again trying to write the program with as few methods as possible, this resulted in a 
	SinglyLinkedList that was much clearn and shorter than the original. Remove() and insert() were the most challenging.

MyStack:
	the only method I included outside of the methods suggested on the assignment PDF was peek method. I went to the Java API
	and looked at some of the methods included in it and saw that peek would be extremely useful for checking what was currently
	ontop of the stack without having to remove the node. MyStack is a straightforward simple program so no problems here.

StartUp:
	This is where my main method is located and where I wrote a method to convert an infix string to a postfix string. I 1st tried to
	do so with a switch statement but I couldn't get it to work. My final implementation uses allot of if statements to parse through
	the infix string and see what each character is. If it is an operator then it checks precedence. If it is not an operator I append
	the character to an output string labeled postfix. I have tried a few examples and I think this finally gets the job done. I tried
	to follow the algorithm and just converted all the operations using conditionals.  
