package com.lti.lambda;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee{
	int empId;
	String empName;
	double empSalary;
	public Employee(int empId, String empName, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
	
}

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> number=new ArrayList<>();
		number.add(10);number.add(20);number.add(30);number.add(40);number.add(50);
		number.add(40);number.add(70);number.add(60);number.add(20);number.add(60);
		/*
		 * Iterator iterator=number.iterator(); while(iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 */	
		System.out.println(number.stream());
		System.out.println(number.stream().count());
		System.out.println("-----------------------------------");
		number.stream().forEach(num->System.out.println(num));
		System.out.println("--------------filtering---------------------");
		number.stream().filter(num->num>30).forEach(num->System.out.println(num));
		System.out.println("---------------distinct--------------------");
		number.stream().filter(num->num>30).distinct().forEach(num->System.out.println(num));
		
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(1,"john",3300));
		employees.add(new Employee(2,"mick",1500));
		employees.add(new Employee(3,"nick",4500));
		employees.add(new Employee(4,"mohit",7200));
		employees.add(new Employee(5,"rohit",10000));
		System.out.println("--------------filtering---------------------");
		employees
		.stream()
		.filter(e->e.empSalary>3000)
		.forEach(e->System.out.println(e));
		System.out.println("-----------------------------------");
		employees
		.stream()
		.forEach(System.out::println);
		System.out.println("----------------Mapping-------------------");
		employees
		.stream()
		.map(emp->emp.empName.toUpperCase())
		.forEach(System.out::println);
		System.out.println("----------------Mapping and Sorting-------------------");
		employees
		.stream()
		.map(emp->emp.empName.toUpperCase())
		.sorted()
		.forEach(System.out::println);
		System.out.println("----------------Collection-------------------");
		List<String> names=employees
		.stream()
		.map(emp->emp.empName.toUpperCase())
		.sorted()
		.collect(Collectors.toList());
		System.out.println(names);
	}

}
