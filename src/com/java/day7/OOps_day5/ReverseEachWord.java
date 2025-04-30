package com.java.day7.OOps_day5;

public class ReverseEachWord {

	public static void main(String[] args) {

		String str = "hello world this is java";
		// olleh dlrow siht si avaj
		String[] arStr = str.split(" ");
		for (int i = 0; i < arStr.length; i++) 
		{
			String s1 = arStr[i];
			//s1--> world
			//j-> -1
			for(int j=s1.length()-1;j>=0;j--)
			{
				char ch=s1.charAt(j);
				System.out.print(ch);
			}
			System.out.print(" ");
		}

	}

}
