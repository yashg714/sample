package com.lti.lambda;
/*
interface AddCalc{
	void sum(int num1,int num2);
}
*/
/*
 * class AddCalcImpl implements AddCalc {
 * 
 * @Override public void sum(int num1, int num2) {
 * System.out.println("Sum is "+(num1+num2)); }
 * 
 * }
 */
public class LambdaDemo1{

	public static void main(String[] args) {
		/*
		 * AddCalcImpl ob=new AddCalcImpl(); ob.sum(10,20);
		 */
		//anonymous class
//		AddCalc addCalc=new AddCalc() {
//			
//			@Override
//			public void sum(int num1, int num2) {
//				System.out.println("Sum is "+(num1+num2));
//			}
//		};
//		addCalc.sum(10, 20);
		
		//anonymous function
		
		AddCalc addCalc=(int num1, int num2)-> {
				System.out.println("Sum is "+(num1+num2));
		};
		addCalc.sum(10,20);
	}

}
