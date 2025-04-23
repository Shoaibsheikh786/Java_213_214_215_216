package com.java.day5;

public class Program4 {
  public static void main(String[] args) {
	// Swap of two numbers without using 
	  //3rd/temp variables 
	  
	  int x=10;
	  int y=20;
	  
	  System.out.println("Value of x "+x); // 10
	  System.out.println("value of y "+y); // 20 
	  
	  x=x+y;
	  y=x-y;
	  x=x-y;
	  
	  System.out.println("Value of x "+x); // 20, -20, 
	  System.out.println("value of y "+y); // 10,
}
}
