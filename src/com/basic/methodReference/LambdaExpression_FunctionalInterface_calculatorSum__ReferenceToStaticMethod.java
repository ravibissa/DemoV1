package com.basic.methodReference;

import com.basic.scope.Interface.CalculatorInterface;

class MyInteger2 {
	
	static int sum(int val1,int val2) {
		return val1+val2;
	}

}
public class LambdaExpression_FunctionalInterface_calculatorSum__ReferenceToStaticMethod {
	
	public static void main(String[] args) {
		
		CalculatorInterface sum = MyInteger2::sum;
		Integer result = sum.sumMethod(2,4);
		System.out.println("result : "+result);
		
	}

}
