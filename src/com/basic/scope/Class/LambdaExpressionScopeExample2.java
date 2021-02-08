package com.basic.scope.Class;

import com.basic.scope.Interface.CalculatorInterface;

public class LambdaExpressionScopeExample2 {
	
	
	// Instance variable can be accessed in lambda expression in java 8
    final int instanceVariable = 1; // Instance variable
    
    // Static variable can be accessed in lambda expression in java 8
    static int staticVariable = 2; // Static variable
	
	public static void main(String[] args) {
		
		LambdaExpressionScopeExample2  obj = new LambdaExpressionScopeExample2();
		
		CalculatorInterface sum = (val1, val2) ->{
			return val1 + val2 +obj.instanceVariable+staticVariable;
			
		};
		
		// Call sumMethod
				Integer result = sum.sumMethod(2, 3);
				System.out.println("sumResult = " + result); 
	}

}
