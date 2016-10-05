/*
 *
 * Converts an infix expression to postfix using MyStack
 * author @jandrepont
 * HW1 CSCI 2125 UNO Fall 2016
 *
 */

import java.util.Scanner;
public class InfixPostfixConv{   

    public static void main(String[] args) {
    	
        System.out.println("Type in an infix expression");
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        System.out.println("The Postfix is :\n"+ConvToPost(string));
    }
	/**
	*Converts an infix expression into a post fix expression
	*@return String
	*/

    public static String ConvToPost(String infix) {	//infix input
        String postfix = " ";						//create empty String to append values to
		MyStack<Character> stack = new MyStack<Character>();
        for (int index = 0; index < infix.length(); ++index) {	//loops through the entire infix length
            char chValue = infix.charAt(index);					//chValue is each char for the loop
            if (chValue == '(') {				//1st case: ( parenthesis
                stack.push('(');				//always push
            } else if (chValue == ')') {		//for each char that is not ) append each char and pop the remaining operations
                Character oper = stack.peek();
                while (!(oper.equals('(')) && !(stack.isEmpty())) {
                    postfix += oper.charValue();
                    stack.pop();
                    oper = stack.peek();
                }
                stack.pop();				
            } else if (chValue == '+' || chValue == '-') {	//2nd case: + or - binary operators
                //Stack is empty			
                if (stack.isEmpty()) {		//if stack is empty always push either a + or -
                    stack.push(chValue);
                    //current Stack is not empty
                } else {
                    Character oper = stack.peek();	//while stack is not empty or operator is either a ( or ) then pop 
                    while (!(stack.isEmpty() || oper.equals(new Character('(')) || oper.equals(new Character(')')))) {
                        stack.pop();
                        postfix += oper.charValue(); //if pop then append
                    }
                    stack.push(chValue);	//push + or - for any other instance
                }
				//third case: * or / binary operators
            } else if (chValue == '*' || chValue == '/') {
                //Stack is empty
				if (stack.isEmpty()) {		
                    stack.push(chValue);
                } else {
                    Character oper = stack.peek(); //if operator is a + or - pop the stack bc of lower precedence
                    while (!oper.equals(new Character('+')) && !oper.equals(new Character('-')) && !stack.isEmpty()) {
                        stack.pop();
                        postfix += oper.charValue();//since pop, must append
                    }			//otherwise push the value
                    stack.push(chValue); //otherwise push the operator
                }
            } else {
                postfix += chValue; //if not an operator, append
            }
        }
		//for all cases where operator is not ( we continue popping until reaching it. 
        while (!stack.isEmpty()) { 
            Character oper = stack.peek();
            if (!oper.equals(new Character('('))) {
                stack.pop();
                postfix += oper.charValue();
            }
        }
    return postfix;
	}

}
