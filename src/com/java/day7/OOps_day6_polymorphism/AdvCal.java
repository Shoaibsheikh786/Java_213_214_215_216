package com.java.day7.OOps_day6_polymorphism;
class Calculator
{
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	void div(float a,float b)
	{  
		System.out.println("issue in the code");
		System.out.println(a/b);
	}
	
	
   
}
public class AdvCal extends Calculator{
	void power(double a,double b)
	{
		double c=Math.pow(a, b);
		System.out.println(c);
	}
	
	
	void div(float a,float b)
	{
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		
		AdvCal o1=new AdvCal();
		o1.add(10, 20); // 30
		o1.div(10.0f, 3.0f);  // 3.333 , 3
		o1.power(2, 3); // 8, 
		
		
		
	}

}
