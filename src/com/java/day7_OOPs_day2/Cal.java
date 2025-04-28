package com.java.day7_OOPs_day2;

public class Cal {
	
	//member of a class without object
	int a;
	int b;
	
	//which will add two numbers
	void addTwoNumbers()
	{
		System.out.println(a+b);
	}
	
	void subTwoNumber(int x, int y)
	{
	   a=x;
	   b=y;
	   System.out.println(a-b);
	}
	
	//divison -> 2 numbers , paramter
	void div(int num1,int num2)
	{
		a=num1;
		b=num2;
		int c=a/b;
		System.out.println(c);
	}
	

}
