package com.java.day7.OOps_day6_Constructor;

public class B1 extends A1 {

	int a = 20; //instance variables 
	void printValue()
	{
		System.out.println("Value of a "+super.a);
	}
   
	void pefernce()
	{
		int a=30;
		System.out.println("Value of a is "+a );
		System.out.println("Value of instance a "+this.a);
		System.out.println("Value of Parent a "+super.a);
	}
	public static void main(String[] args) {
		B1 o1 = new B1();
		o1.pefernce();
		
		
		
	}

}
