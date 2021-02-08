package com.basic.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
	public static void main(String[] args) {
		
		List<String> vehicles = Arrays.asList("bus","car","bicycle","train");
		
		List<String> vehicleListUpperCase = new ArrayList<String>();
		//take function
		vehicleListUpperCase = vehicles.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println(vehicleListUpperCase);
		vehicles.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
		
	}

}
