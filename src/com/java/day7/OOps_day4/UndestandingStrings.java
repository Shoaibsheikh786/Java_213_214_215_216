package com.java.day7.OOps_day4;

public class UndestandingStrings {
	
	public static void main(String[] args) {
		//jhon;
		
		
	//	String s=new String("jhon");
		String s="jhon123";
		String s2="abcxyz";
		//we have methods in string class
		int l=s.length();
		int l2=s2.length();
		System.out.println(l);
		System.out.println(l2);
		
		//Compare Two two strings
		boolean b=s.equals("jhon123");
		System.out.println(b);
		
		String s3="abc";
		String s4="ABC";
		
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		String s5="Quality thought";
		//to uppercase
		System.out.println(s5.toUpperCase());
		
		String s6="QUALITY THOUGHT";
		System.out.println(s6.toLowerCase());
		
		// 
		String s7="jhon";
		System.out.println(s7.charAt(3));  //index
		
		//to check if a string contains
		String s8="This is my pen";
		 System.out.println(s8.contains("my pen"));
		 
		 //how to replace
		System.out.println(s8.replace("my", "your"));
		
		//to check index of a character
		String s9="abc defdz  x";
		System.out.println(s9.indexOf('c'));
		System.out.println(s9.indexOf('R')); //-1 :-> character is not present
		System.out.println(s9.indexOf('d')); // 3 : left to right ---> 
		System.out.println(s9.lastIndexOf('d'));// <-----------
		System.out.println(s9.length());
		
	
		
		
		
	}

}
