package com.java.day5;

public class Arrays4 {
	
	public static void main(String[] args) {
	 
		//wap to reverse a number
		
		//0 x 10 + remainder
		
		//1. Take the last digit
		  //-> 4
		
		//4 x 10 + 3=>43
		//43
		
		//43 x 10 + 2=> 432
		
		int n=432;  // 
		int rem=0;
		int rev=0;
		while(n>0)
		{
			rem=n%10;          //rem->4
			rev=rem; //rev->234
			n=n/10;             //432,43, 4, 0
		}
		
		System.out.println(rev);
		
		
		

	}

}
