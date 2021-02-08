package com.basic.scope.Class;

import com.basic.scope.Interface.CalculatorInterface;

public class LambdaExpressionScopeExample {

	public static void main(String[] args) {
		// Final Local variable can be accessed in lambda expression in java 8
	 int x = 1; // Final Local variable
	 //int x = 1;
		// Provide implementation (definition) of sumMethod - using Lambda expression
		CalculatorInterface sum = (val1, val2) -> {
			//x = x + 1; //COMPILATION ERROR
			return val1 + val2 + x;
		};

		// Call sumMethod
		Integer result = sum.sumMethod(2, 3);
		System.out.println("sumResult = " + result); // 6

	}
}
