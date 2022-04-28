package com.qa.calculatortask;

import java.util.Scanner;

public class CalculatorScanner {
	
	
	public static double result;
	
	public static double add(double firstNumber, double  secondNumber) {
		result = firstNumber + secondNumber;
		return result;
	}
	
	public static double sub(double firstNumber, double  secondNumber) {
		result = firstNumber - secondNumber;
		return result;
		
	}
	
	public static double div(double firstNumber, double  secondNumber) {
		result = firstNumber / secondNumber;
		return result;
	}
	
	public static double mult(double firstNumber, double  secondNumber) {
		result = firstNumber * secondNumber;
		return result;
	}
}
