package com.java.day6_OOPs;

public class MynewClass {
	
	static void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum "+c);
	}
	//sub
	static void sub()
	{
		int a=10;
		int b=5;
		System.out.println(a-b);
	}
	static void div()
	{
		int a=15;
		int b=3;
		System.out.println(a/b);
	}

	public static void main(String[] args) {
    
	 //i want to add two numbers
		//code keep in method
		
		//1.create a method
		//2. call a method
		add();
		sub();
		add();
		div();
		System.out.println("This is some other code");
       add();
       div();
       sub();
		
		
	}

}
