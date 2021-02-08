package com.basic.test;

public class LambdaExpressionExample {
	
	public static void main(String[] args) {
		MyInterface<Integer,String> integerVal= (stringVal) -> Integer.valueOf(stringVal);
		Integer result = integerVal.convertStringToIntegerMethod("12");
        System.out.println("Integer = "+result); 
	}

}
