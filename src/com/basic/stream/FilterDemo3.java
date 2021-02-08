package com.basic.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
	//filter null from collections
	public static void main(String[] args) {
		
		 List<String> words=Arrays.asList("Melisandre","Sansa","Jon","Daenerys",null,"Joffery",null);
		 
		 List<String> results = new ArrayList<String>();
		 results = words.stream().filter(w-> w != null).collect(Collectors.toList());
		 System.out.println(results);
		 
		 words.stream().filter(w-> w !=null).forEach(System.out::println);
	}

}
