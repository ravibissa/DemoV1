package com.basic.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(10,15,20,25,30);
		List<Integer> evenNumList = new ArrayList<>();
		//predicate
		evenNumList =numList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumList);
		//for each taking consumer 
		numList.stream().filter(n->n%2==0).forEach(n-> System.out.println(n));
		//another ways to write above statement
		numList.stream().filter(n->n%2==0).forEach( System.out::println);
	}

}
