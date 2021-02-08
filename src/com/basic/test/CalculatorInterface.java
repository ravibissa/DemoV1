package com.basic.test;

@FunctionalInterface
public interface CalculatorInterface<A> {

	public abstract A sumMethod(int a, int b);

}
