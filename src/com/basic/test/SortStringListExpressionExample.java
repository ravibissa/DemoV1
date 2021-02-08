package com.basic.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStringListExpressionExample {

	public static void main(String[] args) {
		// Declare StringArray
		String[] stringArray = { "ab", "ef", "cd" ,"bd"};

		// Convert String Array to String List
		List<String> stringList = Arrays.asList(stringArray);

		// In Java 8 - Sort StringList using > Lambda expression - in one line
		Collections.sort(stringList, (a, b) -> a.compareTo(b));

		System.out.println(stringList);
	}

}
