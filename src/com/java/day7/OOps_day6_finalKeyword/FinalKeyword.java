package com.java.day7.OOps_day6_finalKeyword;
final class UnderstandingFinal
{
final	float pi=3.1419f;
	
	public void changeValue()
	{
	  //a=3.4  X--> it can't be changed, :- pi is final 
	}
	
final	void add()
	{
		System.out.println("Hello this is add method parent class");
	}
}

public class FinalKeyword  {
 
	//over-riding
//	void add()
//	{
//		//some
//		System.out.println("Hello this is add method in sub-class");
//	}
//	
	public static void main(String[] args) {
		FinalKeyword o1=new FinalKeyword();
	//	o1.add();
		
	}

}
