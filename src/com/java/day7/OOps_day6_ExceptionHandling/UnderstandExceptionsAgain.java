package com.java.day7.OOps_day6_ExceptionHandling;

public class UnderstandExceptionsAgain {
	
	public static void main(String[] args) {
		
		int a=100;
		int b=0;           //1. -> 0
		System.out.println("Hello world");
	
		try
		{	
			
			System.out.println("Division "+(a/b));
		}
		catch(Exception e)
		{
			//if there is any exception
			System.out.println("Denominator can't be zero 0");
		}
		finally
		{
			System.out.println("it will execute even there is excep. or not ");
		}
			
		System.out.println("After Division Code");
	}

}
