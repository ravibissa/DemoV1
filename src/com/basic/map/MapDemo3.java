package com.basic.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
	
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(2,4,6,8,9);
		
		List<Integer> multiplyList = new ArrayList<>();
		
		number.stream().map(n-> n*2).forEach(System.out::println);
		
		multiplyList = number.stream().map(n-> n*2).collect(Collectors.toList());
		System.out.println(multiplyList);
		
	}

}
