package com.lti.lambda;
@FunctionalInterface
interface Isum<T>{
	T sum(T num1,T num2);
	
}
@FunctionalInterface
interface ISquare
{
	void square(double side);
}
public class LambdaDemo2 {

	public static void main(String[] args) {
		
//		Isum<Double> isum=(num1,num2)->{
//			Double var=num1+num2;
//			return var;
//		};
		Isum<Double> isum=(num1,num2)->{return num1+num2;};
		System.out.println(isum.sum(10.5,15.2));
	
		isum.sum(10.25, 250.0);
		ISquare iSquare=(double side)->{System.out.println(side*side);};
		iSquare.square(15);
	}

}
