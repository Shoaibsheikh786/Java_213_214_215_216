package com.java.day7.OOps_day5;
class Box
{
	int a;
	int b;
	void add()
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	void sub(int x,int y)
	{
		System.out.println(x-y);
	}
	//constructor --> specail method
   Box(int a)
   {
	   System.out.println("Value of a "+a);
   }
   Box(String s1,int s2)
   {
	   System.out.println(s1+s2);
   }
   Box()
   {
	   System.out.println("Hello world is this new Construcotr");
   }
}
public class ConstructorsConcept {

	public static void main(String[] args) {
	//	Box o1=new Box(); //default constructor
    //	Box o1=new Box(5);
	//	Box o1=new Box("hello",6);
	}

}
