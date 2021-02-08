package com.basic.stream.method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
	
	public static void main(String[] args) {
		
	List<String> VehicleList = Arrays.asList("bus","car","bicycle","bus","car","bus");
	
	List<String> disVehicle = VehicleList.stream().distinct().collect(Collectors.toList());
	
	System.out.println(disVehicle);
	
	 VehicleList.stream().distinct().forEach(System.out::println);
	 
	 VehicleList.stream().distinct().forEach(v->System.out.println(v));
	 
	 //count
	long count = VehicleList.stream().distinct().count();
	System.out.println(count);
	
	
	//limit
	List<String> limVehicle =VehicleList.stream().limit(2).collect(Collectors.toList());
	 System.out.println(limVehicle);
	 
	 VehicleList.stream().limit(2).forEach(System.out::println);
	}

}
