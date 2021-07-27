package com.lti.Exception;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class ExceptionMain {
	static int arr[]=new int[] {10,20,30,40,50};
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num1,num2,pos;
		System.out.println("Main Begin");
		System.out.println("ENter 2 number");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		System.out.println(divide(num1, num2));
		System.out.println("enter the position");
		pos=scanner.nextInt();
		System.out.println(getElement(pos));
		System.out.println("Main End");
	}
	private static int divide(int num1,int num2) {
		int res = 0;
		try {
			res=num1/num2;
		}
		catch (ArithmeticException e) {
			System.out.println("Number divided by zero ");
			System.out.println(e.getMessage());
		}
		return res;
	}
	private static int getElement(int index) {
		try {
			return arr[index];
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Position not found");
		}
		return 0;
	}
}
