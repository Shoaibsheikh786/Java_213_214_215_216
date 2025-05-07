package com.java.abstraction;
abstract class RBI1
{
	abstract void add();
	void sub()
	{
		System.out.println("hello world ");
	}
	
	RBI1()
	{
		System.out.println("This is RBI Construcotor");
	}
}
public class UnderstandAbstractClass extends RBI1 {
	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		UnderstandAbstractClass o1=new UnderstandAbstractClass();
	}

	

}
