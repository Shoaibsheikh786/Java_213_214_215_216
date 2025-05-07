package com.java.abstraction;
interface a1
{
	void add();
  // we can provide code as well
  //after java 8 update, it will work
	static void mul()
	{
		//code
	}
	default void checkStud()
	{
		System.out.println("This is default method");
	}

}

interface a2  extends a1
{
	void sub();
}
public class UnderstandInterfaces implements a2 {

	@Override
	public void add() {
		
	}

	@Override
	public void sub() {
		
	}






}
