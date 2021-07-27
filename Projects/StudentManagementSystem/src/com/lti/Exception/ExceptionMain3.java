package com.lti.Exception;

public class ExceptionMain3 {
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
		catch (ArithmeticException e) {
			// TODO: handle exception
		}
		
		System.out.println("Main end");
	}
}
