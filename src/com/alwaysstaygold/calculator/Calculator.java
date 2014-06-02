package com.alwaysstaygold.calculator;
import java.util.Scanner;
public class Calculator {
	
	Scanner sc = new Scanner(System.in);
	//this is where the program really starts
	public void start(){
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
	
	//This is the main menu where the user decides between simple math and formulas
	private void mainMenu() {
		System.out.println("YAY!!! I have a friend!!! Let me go call my mommy!!!");
		System.out.println("Alright, now that we have established our friendship I will do some math-y stuff for you!");
		System.out.println("Would you like to do:");
		System.out.println("1. Simple math");
		System.out.println("2. Formulas");

		String decision1 = sc.nextLine();
		int tempChoiceInt = 0;
		try {
		tempChoiceInt = Integer.parseInt(decision1);
		}
		catch (Exception e) {
			//Do nothing
		}
		if (decision1.equalsIgnoreCase("simple math") || tempChoiceInt == 1){
			simpleMathMenu();
		}
		else if (decision1.equalsIgnoreCase("formulas") || tempChoiceInt == 2){
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
	
	//This is the formula menu where users decide which formula they want to work with
	public void formulasMenu() {
		Formulas formulas = new Formulas();
		System.out.println("Would you like to use/find:");
		System.out.println("1. quadratic formula");
		System.out.println("2. pythagorean theorem");
		System.out.println("3. area of a triangle");
		System.out.println("4. area of a rectangle");
		
		String choice = sc.nextLine();
		int tempChoiceInt = 0;
		try {
		tempChoiceInt = Integer.parseInt(choice);
		}
		catch (Exception e) {
			//Do nothing
		}
		if (choice.equalsIgnoreCase("quadratic formula") || tempChoiceInt == 1){
			double sol1 = formulas.quadraticFormula();
			System.out.println("x = "+sol1);
			double sol2 = formulas.quadraticFormula();
			System.out.println("or x + "+sol2);
		}
		else if (choice.equalsIgnoreCase("pythagorean theorem") || tempChoiceInt == 2){
			double num1=4;
			double num2=3;
			double answer = formulas.pythagoreanTheorem(num1,num2);
			System.out.println("The answer is "+answer);
		}
		else if (choice.equalsIgnoreCase("area of a triangle") || tempChoiceInt == 3){
			double num1=4;
			double num2=3;
			double answer = formulas.areaTriangle(num1,num2);
			System.out.println("The answer is " + answer);
		}
		else if (choice.equalsIgnoreCase("area of a rectangle") || tempChoiceInt == 4){
			double num1=4;
			double num2=3;
			double answer = formulas.areaRectangle(num1,num2);
			System.out.println("The answer is " + answer);
		}
	}

} //End class
