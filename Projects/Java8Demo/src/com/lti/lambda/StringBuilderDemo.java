package com.lti.lambda;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String str="Yash";
		str.concat("Gupta");
		System.out.println(str);

		StringBuilder sb=new StringBuilder("Yash");
		sb.append("Gupta");
		System.out.println(sb);
		
		System.out.println(sb.charAt(2));
		System.out.println(sb.indexOf("up"));

	}

}
