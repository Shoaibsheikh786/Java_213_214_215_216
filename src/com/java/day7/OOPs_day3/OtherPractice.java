package com.java.day7.OOPs_day3;
class Check
{
	int a;
	int b;
	void printValueA()
	{
		System.out.println(a);
	}
	void setValueA(int x)
	{
		a=x;
	}
	void setValueB(int y)
	{
		b=y;
	}
	void setAB(int x,int y)
	{
		a=x;
		b=y;
	}
	
}
public class OtherPractice {
	
	public static void main(String[] args) {
		Check c1=new Check();
		Check c2=new Check();
	    // c1.a=10;
		c1.setValueA(10);
		System.out.println(c1.a);
		
		//differnt way to stroe
	//	c2.a=10; //not good practice
		c2.setValueA(10);
		
	}

}
