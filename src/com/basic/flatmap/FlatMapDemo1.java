package com.basic.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {
	
	public static void main(String[] args) {
		//map
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2 = new ArrayList<Integer>();
		list2 =list1.stream().map(n-> n+10).collect(Collectors.toList());
		System.out.println(list2);
		
		//flatmap
		
		List<Integer> lst1 = Arrays.asList(1,2);
		List<Integer> lst2 = Arrays.asList(3,4);
		List<Integer> lst3 = Arrays.asList(5,6);
		
		List<List<Integer>> finalLst = Arrays.asList(lst1,lst2,lst3);
		
		List<Integer> finalResult =finalLst.stream().flatMap(x-> x.stream().map(n->n+5)).collect(Collectors.toList());
		
		System.out.println(finalResult);
	}

}
