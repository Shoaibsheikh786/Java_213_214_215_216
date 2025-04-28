package com.java.day7.OOPs_day3;

public class Methods {

	int a;
	int b;
	int c;

	int add(int x, int y) // void ->
	{
		a = x;
		b = y;
		c = a + b;
		return c;
	}
	// create one method div, return the value

	float div(float x, float y) // z-> float
	{
		float z = x / y;
		return z;
	}
	
	char div2(float x,float y)
	{
	  	char ch='a';
	  	float z=x-y;
	  	return ch;
	}

	public static void main(String[] args) {

		// 1.Create an Object
		Methods obj1 = new Methods();
	 char ab=	obj1.div2(20, 10);
	 System.out.println(ab);
		
//		int d=obj1.add(10, 20);
//		System.out.println("The Sum "+d);
//		float a = obj1.div(10.0f, 5.0f);
//		System.out.println("Div " + a);
	//	System.out.println(obj1.div(10.0f, 3.0f));;
		

	}

}
