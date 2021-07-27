package com.lti.lambda;
@FunctionalInterface
interface AddCalc{
	void sum(int num1,int num2);
}
@FunctionalInterface
interface Shape{
	void area();
}

public class LambdaDemo{

	public static void main(String[] args) {
		
		
		//anonymous expression or function
		
		AddCalc addCalc=(int num1, int num2)-> {
				System.out.println("Sum is "+(num1+num2));
		};
		addCalc.sum(10,20);
		
		//lambda function for circle
		Shape circle=()->{
			System.out.println("Area of circle is "+3.14*5*5);
		};
		
		//lamabda function for rectangle
		Shape rectangle=()->{
			System.out.println("Area of rectangle is "+10*15);
		};
		circle.area();
		rectangle.area();
	}

}
