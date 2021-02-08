package com.basic.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

}

public class Demo4MapNFilter {
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "abc", 2000));
		employees.add(new Employee(2, "kio", 3000));
		employees.add(new Employee(3, "pao", 4000));
		employees.add(new Employee(4, "odu", 7000));
		employees.add(new Employee(5, "hjk", 1000));
		
		List<Integer> empSalList = new ArrayList<>();
		
		empSalList = employees.stream().
					filter(e-> e.salary>2000)
					.map(e->e.salary)
					.collect(Collectors.toList());
		
		System.out.println(empSalList);
		
	}

}
