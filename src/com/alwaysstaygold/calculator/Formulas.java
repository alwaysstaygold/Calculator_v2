package com.alwaysstaygold.calculator;
import java.util.Scanner;
import static java.lang.Math.*;
public class Formulas {

	Scanner sc = new Scanner (System.in);
	public double quadraticFormula(boolean pos){

		System.out.println("Imput a value for a");
		double a = sc.nextDouble();
		System.out.println("Imput a value for b");
		double b = sc.nextDouble();
		System.out.println("Imput a value for c");
		double c = sc.nextDouble();
		double x=(-(b)+ sqrt((b*b)-4*a*c)/2*a);
		return x;
		//clean this up

	}
	public double pythagoreanTheorem(double num1, double num2){
		double answer=num1+num2;
		return answer;
	}
	public double areaTriangle (double num1, double num2){
		double answer=num1+num2;
		return answer;
	}
	public double areaRectangle (double num1, double num2){
		double answer=num1+num2;
		return answer;
	}

}
