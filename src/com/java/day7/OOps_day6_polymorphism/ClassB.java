package com.java.day7.OOps_day6_polymorphism;
//Polymorphisim 
// one entity can have multiple forms 

class A
{ 
	//addition of two numbers
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	//addition of three number
	void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	void add(String s1,String s2)
	{
		System.out.println(s1+s2);
	}

}
public class ClassB {
	
	public static void main(String[] args) {
		A ob1=new A();
//		ob1.add("hello ","world");
//		ob1.add(10,12);
//		ob1.add(10, 20,30);
		
		// 1 , "hello"
		System.out.println(1);
		System.out.println("Hello");
		System.out.println(true);
		

	}

}
