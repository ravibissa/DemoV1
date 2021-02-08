package com.basic.test;

public class LambdaExpression_FunctionalInterface_calculatorSum {
	
	public static void main(String[] args) {
		
		CalculatorInterface<Integer>  sum = (int val1,int val2) -> {return val1 + val2 ;};
		
		/*CalculatorInterface<Integer> sum = (val1, val2) -> {
		    return val1 + val2;
		};*/
		
		//CalculatorInterface<Integer> sum = (val1, val2) -> val1 + val2;
		int result = sum.sumMethod(2, 5);
		System.out.println("Sum : "+result);
	}
}
