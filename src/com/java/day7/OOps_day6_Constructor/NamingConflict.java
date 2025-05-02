package com.java.day7.OOps_day6_Constructor;

public class NamingConflict {
	
	int a;  
	void getA(int a) //a-> 10
	{
		this.a=a; //value in a assing in a
	   
	}
	void printA()
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		NamingConflict o1=new NamingConflict(); 
		o1.getA(10);
		o1.printA();
	}

}
