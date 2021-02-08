package com.basic.program;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindEvenNumberInRange {
	public static void main(String[] args) {
		IntStream.range(1, 6).filter(n -> n % 2 == 0).forEach(System.out::println);
		System.out.println("=========");
		IntStream.of(1,2,3,4,5,6,7).filter(n ->n%2 ==0).forEach(System.out::println);
		
		System.out.println("Find all even number greater than 2");
		
		IntStream.range(0,10).filter( n->n>2).filter(n ->n%2 ==0).forEach(System.out::println);
		
		
		System.out.println("Find all odd number between 1 to 5");
		IntStream.of(1,2,3,4,5).filter(n ->n%2 ==1).forEach(System.out::println);
		
		System.out.println(" Find sum");
		int sum = IntStream.range(0,5).sum();
		System.out.println("Sum::"+sum);
		
		int evenSum = IntStream.range(0,5).filter(n -> n%2 ==0).sum();
		System.out.println("evenSum::"+evenSum);
		
		OptionalInt max = IntStream.of(2,4,5,7,44,77,98,9).max();
		System.out.println("Max::"+max.getAsInt());
		
		OptionalInt min = IntStream.of(2,4,5,7,44,77,98,9).min();
		System.out.println("MIN::"+min.getAsInt());
		
		OptionalDouble average = IntStream.range(0,5).average();
		System.out.println("AVERAGE::"+average.getAsDouble());
		
		long count = IntStream.of(2,4,5,7,44,77,98,9).count();
		System.out.println("COUNT::"+count);
		
		long countRecordsGreaterThan = IntStream.of(1, 2, 3, 4, 5,6).filter((n) -> n > 2 ).count();
        System.out.println("Count number of records greater than 2 = "+countRecordsGreaterThan);
        
        int reduce = IntStream.of(1,2,3,4,5).reduce(10,(x,y) -> x+y);
        System.out.println("REDUCE::"+reduce);
        
        OptionalInt findFirst = IntStream.of(1,2,3,4,5).findFirst();
        System.out.println("findFirst::"+findFirst.getAsInt());
        
        OptionalInt findAny = IntStream.of(34,2,3,4,5).findAny();
        System.out.println("findAny::"+findAny.getAsInt());
        
        boolean anyRecordGreaterThan = IntStream.of(1, 2, 3, 4, 5).anyMatch((n) -> n > 2 );
        System.out.println("Any Record greater than 2  = " + anyRecordGreaterThan); //true


        // Find whether ALL records greater than 2
        boolean allRecordGreaterThan = IntStream.of(1, 2, 3, 4, 5).allMatch((n) -> n > 2 );
        System.out.println("All Record greater than 2  = " + allRecordGreaterThan); //false
        

        // Find whether NONE of the record greater than 6
        boolean noneRecordGreaterThan = IntStream.of(1, 2, 3, 4, 5).noneMatch((n) -> n > 6 );
        System.out.println("None Record greater than 6  = " + noneRecordGreaterThan); //true
		
		
	}

}
