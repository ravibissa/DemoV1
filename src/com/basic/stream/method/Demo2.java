package com.basic.stream.method;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo2 {
	
	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		long number = numList.stream().filter(v-> v%2==0).count();
		System.out.println(number);
		
		
		//min
		
		Optional<Integer> min =numList.stream().min((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(min.get());
		
		//max
		Optional<Integer> max =numList.stream().max((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(max.get());
	}

}
