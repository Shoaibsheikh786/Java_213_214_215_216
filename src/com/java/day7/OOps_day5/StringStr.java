package com.java.day7.OOps_day5;

public class StringStr {

	public static void main(String[] args) {
       //if lenght of a word is greater than 5
	   // if word starts with au--> reverse
	   
		String str = "hello world selenium this is java automation ";
		// olleh dlrow siht si avaj
		String[] arStr = str.split(" ");
		for (int i = 0; i < arStr.length; i++) 
		{
			String s1 = arStr[i];
			//s1--> world
			//j-> -1
			if(s1.length()>5 || s1.startsWith("au"))
			{
				for(int j=s1.length()-1;j>=0;j--)
				{
					char ch=s1.charAt(j);
					System.out.print(ch);
				}
				System.out.print(" ");
			}
			
		}

	}

}
