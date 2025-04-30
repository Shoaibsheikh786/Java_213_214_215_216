package com.java.day7.OOps_day5;
class Addition
{
	int a;
	int b;
	void sum()
	{
		System.out.println(a+b);
	}
	Addition(int x,int y)
	{
		a=x;
		b=y;
	}
	void setValueA(int x,int z)
	{
		a=x;
		b=z;
	}
}

public class Const2 {

	public static void main(String[] args) {
		Addition o1=new Addition(10,20);
		o1.sum();
//		o1.a=12;
//		o1.b=100;
		o1.setValueA(12, 100);
		o1.sum();
		
		
		
		
		
//		Addition o2=new Addition(13,14);
//		o2.sum();
		
		
		
		
		
		
		
		
//		o1.a=10;
//		o1.b=20;
//		o1.sum();
//		
//		o2.a=13;
//		o2.b=14;
//		o2.sum();
	}

}
