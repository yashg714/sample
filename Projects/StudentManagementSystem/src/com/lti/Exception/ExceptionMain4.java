package com.lti.Exception;

import java.util.Scanner;

public class ExceptionMain4 {
	public static void main(String[] args) {
		System.out.println("Main begin");
		int num[]=null;
		try {
			num=new int[] {1,2,3};
			System.out.println(num[1]);
			int num1[]= {10,20,30,40};
			System.out.println(num1[21]);
			int n=10/0;
		} catch (NullPointerException e) {
			System.out.println("index not intialized");			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array index outout of bound");
		}
		finally {
			System.out.println("finally Excuted");
		}
		int age=0;
		System.out.println("Enter your age:");
		age=new Scanner(System.in).nextInt();
		if(age<0)
		{
			try {
				throw new NegativeAgeException("age is negative");
			} catch (NegativeAgeException e) {
				
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Main end");
	}
}
