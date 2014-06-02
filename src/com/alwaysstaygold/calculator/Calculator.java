package com.alwaysstaygold.calculator;
import java.util.Scanner;
public class Calculator {
	
	Scanner sc = new Scanner(System.in);
	
	public void startCalc(){
		
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
			System.out.println("Would you like to:");
			System.out.println("1. Use the quadratic formula");
			System.out.println("2. Use the pythagorean theorem");
			System.out.println("3. Calculate the area of a triangle");
			System.out.println("4. Calculate the area of a rectangle");
			Formulas formulas = new Formulas();
			String choice = sc.nextLine();
		}
		
	} //End mainMenu
	
	private void simpleMathMenu() {
		System.out.println("Would you like to:");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		String choice = sc.nextLine();
		SimpleMath SimpleMath = new SimpleMath();
		
		int tempChoiceInt = 0;
		try {
		tempChoiceInt = Integer.parseInt(choice);
		}
		catch (Exception e) {
			//Do nothing
		}
		
		if (choice.equalsIgnoreCase("add") || tempChoiceInt == 1){
			System.out.println("Sweeeeet! Give me a number!");
			double num1 = sc.nextDouble();
			System.out.println("Mmmmmmm numbers! Give me another number!");
			double num2 = sc.nextDouble();
			double sum = SimpleMath.addition(num1, num2);
			System.out.println("Your final number is " + sum);
		}
		else if (choice.equalsIgnoreCase("Subtract") || tempChoiceInt == 2){
			System.out.println("Sub... sub... subtraction scares me! But I'll do it anyway! Just for you!");
			System.out.println("Give me a number please");
			double num1 = sc.nextDouble();
			System.out.println("And another one");
			double num2 = sc.nextDouble();
			double sum = SimpleMath.subtraction(num1, num2);
			System.out.println("the answer is " + sum);
		}
		else if (choice.equalsIgnoreCase("Multiply") || tempChoiceInt == 3){
			System.out.println("I would like to request a number of you");
			double num1 = sc.nextDouble();
			System.out.println("Thank you. Give me another and I'll multiply them together!");
			double num2 = sc.nextDouble();
			double product = SimpleMath.multiplication(num1, num2);
			System.out.println("Your final number is " + product);
			
		}
		else if (choice.equalsIgnoreCase("Divide") || tempChoiceInt == 4){
			System.out.println("Type in a number");
			double num1 = sc.nextDouble();
			System.out.println("One more number then I'll do the dividing thing!");
			double num2 = sc.nextDouble();
			double quotient = SimpleMath.division(num1, num2);
			System.out.println("The quotient is " + quotient);
		}
		else {
			System.out.println("Oh dear oh dear!! I believe something went horribly wrong!");
		}
	}
	
	private void formulasMenu() {
		
	}

} //End class
