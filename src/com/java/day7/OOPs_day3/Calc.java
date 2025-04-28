package com.java.day7.OOPs_day3;
/*//1. Create a class Name Calc 
     create three instance variables 
     --> name you can give anything
   . -> Create two methods with return type int
        1. add 
        2. sub
     --> Create two methods
         1. we pass the value from main method and it should 
RETURN the reverse of the number
         2. we pass two numbers from the main method 
it should RETURN the greatest Number*/
public class Calc {
	int a,b,c;
	int add(int x,int y)
	{
		int c=x+y;
		return c;
	}
	int sub(int x,int y)
	{
		int c=x-y;
		return c;
	}
	int reverse(int x)
	{ 
		int rev=0;
		while(x>0)
		{
			int rem=x%10;
			rev=rev*10+rem;
			x=x/10;
		}
		return rev;
	}
	int greatest(int x,int y)
	{
		if(x>y)
		{
			return x;
		}
		  
		else
		{
			return y;
		}
			
	}

}
