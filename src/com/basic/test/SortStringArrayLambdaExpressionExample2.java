package com.basic.test;

import java.util.Arrays;

public class SortStringArrayLambdaExpressionExample2 {

	public static void main(String[] args) {
		String[] stringArray = { "ab", "ef", "cd" };

		System.out.println("In Java 8 - Sort StringArray using > Lambda expression");

		Arrays.sort(stringArray, (String a, String b) -> {
			return a.compareTo(b);
		});

		
	/*	 If there is only Single line in implementation, we can also remove curly braces  (With single line you can also remove return statement) >
		 Arrays.sort(stringArray, (a, b) -> a.compareTo(b));*/
		// Display StringArray
		for (String str : stringArray) {
			System.out.print(str + " ");
		}
	}

}
