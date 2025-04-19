package com.java.day3;

public class LadderIf {

	public static void main(String[] args) {
    
		// ladder if 
		// number > 5 and less than 10 -> hello
		// number >  11 and less than 20 -> hi
		// number > 21 and less than 30 -> java
		// else --> selenium 
		
		//if mulitple --> ladder if 
		
		int n=15;
		if(n>5 && n<100)  //T
		{
			System.out.println("Number is > 5");
		}
		else if (n>11 && n<20)
		{
		    System.out.println("Number is > 11");	
		}
		else if(n>21 && n<30) 
		{
			System.out.println("Number is > 21");
		}
		else
		{
			System.out.println("Number is > 21");
		}
		
		
	}

}
