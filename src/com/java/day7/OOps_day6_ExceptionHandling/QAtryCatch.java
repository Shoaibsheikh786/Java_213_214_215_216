package com.java.day7.OOps_day6_ExceptionHandling;

public class QAtryCatch {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		System.out.println("Hello world");

		try {
             System.out.println("A");
			System.out.println("Division " + (a / b));
			System.out.println("B");
		}
        catch (Exception e) {
			System.out.println("Denominator can't be zero 0");
		}
		finally
		{
			System.out.println("Last Line");
		}
		
	}

}
