package com.lti.string;

public class StringDemo {
	public static void main(String args[]) {
		String str1 = new String("LTI");
		String str2 = new String("LTI");

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		String str3 = "Yash";
		String str4 = "Yash";

		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));

	}
}
