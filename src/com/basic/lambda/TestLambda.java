package com.basic.lambda;

public class TestLambda {

	public static void main(String[] args) {

		MyIntegerCalculator myIntegerCalculator = (x) -> x + 1;
		System.out.println(myIntegerCalculator.calcIt(10));

		MyIntegerCalculator2 cal2 = (x, y) -> x + y;
		System.out.println(cal2.calcIt(5, 8));

		MyIntegerCalculator3 cal3 = (msg) -> {
			return msg;
		};

		System.out.println(cal3.calcIt("hello"));
	}

}

interface MyIntegerCalculator {

	public Integer calcIt(int s1);

}

interface MyIntegerCalculator2 {

	public Integer calcIt(int s1, int s2);

}

interface MyIntegerCalculator3 {

	public String calcIt(String s1);

}
