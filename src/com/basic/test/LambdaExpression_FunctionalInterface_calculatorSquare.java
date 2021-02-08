package com.basic.test;

public class LambdaExpression_FunctionalInterface_calculatorSquare {

	public static void main(String[] args) {
		CalculatorInterface2<Integer> square = (val) -> (val * val);
		Integer result = square.squareMethod(6);
		System.out.println(result);
		
		//anonymousInnerClass
		CalculatorInterface2<Integer> square2 = new CalculatorInterface2() {
	          @Override
	          public Object squareMethod(Object val) {
	              return ((Integer)val * (Integer)val);
	          }
	};
	System.out.println(square2.squareMethod(6));
	
	}

}
