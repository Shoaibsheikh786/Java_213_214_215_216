package com.java.day3;

public class NestedIf {

	public static void main(String[] args) {
       // if percen 33 fail 
		// 60 c grader B , A
		// nested if
		// if block inside the if 
		/* if(condition)
		 *  {
		 *     if(condition)
		 *        {
		 *          code 
		 *         }
		 *  }
		 *  else
		 *  {
		 *   
		 *  }*/
		
		int a=100;
		int b=200;
		int c=300;
		System.out.println("Java");
		
		if(a<b)
		{  
			System.out.println("Hello world");
			if(b>c)
			{
				System.out.println("hello java");
			}
			System.out.println("Selenium");
		}
	}

}
