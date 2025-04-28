package com.java.day7.OOPs_day3;
class Calculator
{

	//return the values to the method
	//add
	//sub
	//div
	//mul
	int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	float div(float a,float b)
	{
		float c=a/b;
		return c;
	}
	int mul(int a, int b)
	{
		//return a*b;
		int c=a*b;
		return c;
	}
	
	//1. -> Create  a method to check if a number is even or odd
	//-> if it is even return true else false
	//-> in main method print even or odd
	
	boolean isEvenOrOdd(int n)
	{
		if(n % 2== 0)
		{
			return true;
		}
		else 
		{
		  return false;	
		}
	}
	
}
public class Methods2 {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		boolean b= c1.isEvenOrOdd(5);
		if(b==true)
		{
		  System.out.println("Even");
		}
		else 
		{
			System.out.println("Odd");
		}
    
	}

}
