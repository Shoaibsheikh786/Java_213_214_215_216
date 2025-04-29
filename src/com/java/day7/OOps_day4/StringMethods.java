package com.java.day7.OOps_day4;

public class StringMethods {
	
	public static void main(String[] args) {
		// hello :-> lenght-> 5,
		
		String s1="Hello@123 ";
		String s2="world";
		System.out.println(s1.startsWith("Hel"));	
		System.out.println(s1.endsWith("2"));
		
		System.out.println(s1.substring(5));;
		System.out.println(s1.substring(2,6));
		
		String s3=s1+s2;  //+ / concationation
		System.out.println(s3);
		String s4=s1.concat(s2);
		System.out.println(s4);
		
		String s5="1";
		String s6="3";
		int s7=2;
		
		System.out.println(s5+s7);  //13,
		
		
		
		
	}

}

