package com.alwaysstaygold.calculator;
import java.util.Scanner;
public class Calculator {
	
	Scanner sc = new Scanner(System.in);
	
	public void main(String[] args){
		
		System.out.println("Welcome you! My name is Cally :) Do you want to be my friend?(Yes or no!)");
		String friendship = sc.nextLine();
		if (friendship.equalsIgnoreCase("yes")){
			mainMenu();
		}
		else if (friendship.equalsIgnoreCase("no")){
			System.out.println("Awww you're mean :'( go away!! I don't like you!");
		}
		else {
			System.out.println("Invalid answer");
		} //End if statement
	} //End startCalc	
	
	
	private void mainMenu() {
		System.out.println("YAY!!! I have a friend!!! Let me go call my mommy!!!");
		System.out.println("Alright, now that we have established our friendship I will do some math-y stuff for you!");
		System.out.println("Would you like to do simple math or formulas?");
		String decision1 = sc.nextLine();
		if (decision1.equalsIgnoreCase("simple math")){
			simpleMathMenu();
		}
		else if (decision1.equalsIgnoreCase("Formulas")){
			formulasMenu();	
		}
		
	} //End mainMenu
	
	//Method for the menu for simple math
	private void simpleMathMenu() {
		SimpleMath simpleMath = new SimpleMath();
		System.out.println("Would you like to:");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		
		//Get user input for menu, and convert to int if possible
		String choice = sc.nextLine();
		int tempChoiceInt = 0;
		try {
		tempChoiceInt = Integer.parseInt(choice);
		}
		catch (Exception e) {
			//Do nothing
		}
		
		//Get user to enter two numbers for computation
		System.out.println("Type in a number");
		double num1 = sc.nextDouble();
		System.out.println("Now another number please");
		double num2 = sc.nextDouble();
		
		//Statements to check for operator to use and call their methods
		//TODO Look into switch statements for use here
		if (choice.equalsIgnoreCase("add") || tempChoiceInt == 1){
			double sum = simpleMath.addition(num1, num2);
			System.out.println("Your final number is " + sum);
		}
		else if (choice.equalsIgnoreCase("Subtract") || tempChoiceInt == 2){
			double sum = simpleMath.subtraction(num1, num2);
			System.out.println("the answer is " + sum);
		}
		else if (choice.equalsIgnoreCase("Multiply") || tempChoiceInt == 3){
			double product = simpleMath.multiplication(num1, num2);
			System.out.println("Your final number is " + product);	
		}
		else if (choice.equalsIgnoreCase("Divide") || tempChoiceInt == 4){
			double quotient = simpleMath.division(num1, num2);
			System.out.println("The quotient is " + quotient);
		}
		else {
			System.out.println("Oh dear oh dear!! I believe something went horribly wrong!");
		}
	}
	
	
	private void formulasMenu() {
		System.out.println("Would you like to use/find:");
		System.out.println("1. quadratic formula");
		System.out.println("2. pythagorean theorem");
		System.out.println("3. area of a triangle");
		System.out.println("4. area of a rectangle");
		Formulas formulas = new Formulas();
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("quadratic formula") || Integer.parseInt(choice) == 1){
			//algo
		}
		else if (choice.equalsIgnoreCase("pythagorean theorem") || Integer.parseInt(choice) == 2){
			
		}
	}

} //End class
