package com.java.day7.OOps_day4;

public class StringPrograms {

	public static void main(String[] args) {
      //lets start Programming practice on Strings
		//Revers a String   --> X
		String s="hello";
		String rev="";
//		
//		System.out.print(s.charAt(4)); //last character
//		System.out.print(s.charAt(3));
//		System.out.print(s.charAt(2));
//		System.out.print(s.charAt(1));
//		System.out.print(s.charAt(0));
		
		for(int i=s.length()-1;i>=0;i--)
		{
		//	System.out.print(s.charAt(i));
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		
		System.out.println(rev);
		
		
		
	}

}
