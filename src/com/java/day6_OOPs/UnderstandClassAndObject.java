package com.java.day6_OOPs;

class Box
{
	int lenght;
	int bredht;
	int height;
}
public class UnderstandClassAndObject {
  public static void main(String []args)
  {
	// Box1-> 10, 12 , 13  
	  //1. Create an object 
	  Box b1=new Box();
	  Box b2=new Box();
	  Box b3=new Box();
	  b1.lenght=10;
	  b1.bredht=12;
	  b1.height=13;
	  b1.lenght=19;
	  System.out.println(b1.lenght);
	  System.out.println(b1.bredht);
	  System.out.println(b1.height);
  }
}


