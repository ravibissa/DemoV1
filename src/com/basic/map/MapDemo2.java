package com.basic.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {
	
	public static void main(String[] args) {
		
		List<String> vehicles = Arrays.asList("bus","car","bicycle","train");
		
		List<Integer> vehiclelength = new ArrayList<Integer>();
		
		vehicles.stream().map(name -> name.length()).forEach(System.out::println);
		
		vehiclelength =vehicles.stream().map(name -> name.length()).collect(Collectors.toList());
		
		System.out.println(vehiclelength);
	}

}
