package com.java.day7.OOps_day4;

public class CheckIfAcharacterExits {
	
	public static void main(String[] args) {
		String s="abeckdekke";  // e
		
		//i have one character 
		
		char ch='e';
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==ch)
			{
				System.out.println("Element Present "+ch);
				break;//once find the element break the loop	
			}
		}
	}

}
