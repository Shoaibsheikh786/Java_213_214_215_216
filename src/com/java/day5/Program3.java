package com.java.day5;

public class Program3 {
	public static void main(String[] args) {
		int x=34;
		int y=23;
		x=x+y;
		y=x-y;
		x=y+x;
		System.out.println("value of x "+x);
		System.out.println("value of y "+y);
	   
		// x-> 68 , y -> 11
		// x-> 57,  y -> 11
		// x-> 57,  y -> 11
		// x-> 91,  y -> 34
		// x-> 57,  y-> 34
		// x-> 34 , y -> 91
		// x-> 68 , y-> 34
	}

}
