package com.java.day7.OOps_day4;

public class PlandromeString {
	
	//:-> 
	public static void main(String[] args) {
		
		String s1="madam123";  // madam
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			rev=rev+ch;
		}
	//	System.out.println(rev);
		
		//if rev and orinal is same ->plaindrome , not prlaidrom
		if(s1.equals(rev))
		{
			System.out.println("String Plaindrome "+rev);
		}
		else
		{
			System.out.println("It is not Plaindrome "+s1);
		}
		
	}

}
