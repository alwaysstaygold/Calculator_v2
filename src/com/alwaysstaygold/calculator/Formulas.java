package com.alwaysstaygold.calculator;
import java.util.Scanner;
import static java.lang.Math.*;
public class Formulas {
	Scanner sc = new Scanner (System.in);
	public double quadraticFormula(){
		System.out.println("Imput a value for a");
		double a = sc.nextDouble();
		System.out.println("Imput a value for b");
		double b = sc.nextDouble();
		System.out.println("Imput a value for c");
		double c = sc.nextDouble();
		b = -(b);
		double bsquared = b*b;
		double product = a*c*-4;
		double allover = 2*a;
		double discriminant = bsquared + product;
		double sqrt = sqrt(discriminant);
		double top1 = b+sqrt;
		System.out.println(top1);
		double top2 = b-sqrt;
		System.out.println(top2);
		double sol1 = top1 / allover;
		double sol2 = top2 / allover;
		System.out.println(sol1);
		System.out.println(sol2);
		return sol1 + sol2;
		//clean this up
	}
	public double pythagoreanTheorem(double num1, double num2){
		return answer;
	}
	public double areaTriangle (double num1, double num2){
		return answer;
	}
	public double areRectangle (double num1, double num2){
		return answer;
	}

}
