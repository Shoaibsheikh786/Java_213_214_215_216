package com.java.day7.OOps_day6_ExceptionHandling;

import java.util.Scanner;

public class GettingInputFromUser {
	
	public static void main(String[] args) {
		//Scanner is class which we will use to get input from user
		int a;
		int b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int c=a+b;
		System.out.println("Sum is "+c);
	}

}
