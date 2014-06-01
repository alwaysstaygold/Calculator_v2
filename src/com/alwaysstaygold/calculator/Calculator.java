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
			System.out.println("YAY!!! I have a friend!!! Let me go call my mommy!!!");
			System.out.println("Alright, now that we have established our friendship I will do some math-y stuff for you!");
			System.out.println("Would you like to do simple math or formulas?");
			String decision1 = sc.nextLine();
			if (decision1.equalsIgnoreCase("simple math")){
				System.out.println("Would you like to:");
				System.out.println("1. Add");
				System.out.println("2. JFSD");
				
				if (decision1.equals("add") || Integer.parseInt(decision1) == 1) {
					
				}
			}
			else if (decision1.equalsIgnoreCase("Formulas")){
				System.out.println("Would you like to use the quadratic formula, the pythagorean theorem or ");
				System.out.println("calculate area of a triangle or the area of a rectangle?");
			}
		
		else if (friendship.equalsIgnoreCase("no")){
			System.out.println("Awww you're mean :'( go away!! I don't like you!");
		}
		else {
			System.out.println("Invalid answer");
		}
	} //End startCalc	
	
	private void mainMenu() {
		System.out.println("YAY!!! I have a friend!!! Let me go call my mommy!!!");
		System.out.println("Alright, now that we have established our friendship I will do some math-y stuff for you!");
		System.out.println("Would you like to do simple math or formulas?");
		String decision1 = sc.nextLine();
		if (decision1.equalsIgnoreCase("simple math")){
			simpleMathMenu();
			
			System.out.println("Would you like to:");
			System.out.println("1. Add");
			System.out.println("2. JFSD");
			
			if (decision1.equals("add") || Integer.parseInt(decision1) == 1) {
				
			}
		}
		else if (decision1.equalsIgnoreCase("Formulas")){
			System.out.println("Would you like to use the quadratic formula, the pythagorean theorem or ");
			System.out.println("calculate area of a triangle or the area of a rectangle?");
		}
		
	} //End mainMenu
	
	private void simpleMathMenu() {
		
	}
	
	private void formulasMenu() {
		
	}

} //End class
