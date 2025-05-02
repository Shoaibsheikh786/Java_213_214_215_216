package com.java.day7.OOps_day6_Constructor;

public class B extends A{
	void sub()
	{
		System.out.println("sub method in B class ");
	}
//	B()
//	{  
//	//	super(); //by def--> 
//		super(4);
//		System.out.println("B Constructor");
//	}
	
	B(String s)
	{
		System.out.println("B -> "+s);
	}
	
	public static void main(String[] args) {
		B o1=new B("Hello");
	}
}
