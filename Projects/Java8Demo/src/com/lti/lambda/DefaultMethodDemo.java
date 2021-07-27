package com.lti.lambda;

interface Isample{
	void method1();
	default void method2() {
		System.out.println("Hello this is default method 2 from interface");
	}
	static void method3()
	{
		System.out.println("Hello this is static method 3 from interface");
	}
}
class CSample implements Isample{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		Isample.super.method2();
	}
	
}
public class DefaultMethodDemo {

	public static void main(String[] args) {
		Isample isample=()->{
			System.out.println("Hello this is interface 1 method 1");
		};
		isample.method2();
		Isample.method3();
	}

}
