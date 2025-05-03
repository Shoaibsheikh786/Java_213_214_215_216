package com.java.day7.OOps_day6_inheritance;

class A
{
	void add()
	{
		System.out.println("Add method in class A");
	}

}
             //child            //parent 
public class Inheritance2 extends A{
	
	void sub()
	{
		System.out.println("Sub method in Inheritance2");
	}
	
	public static void main(String[] args) {

		 Inheritance2 o1=new Inheritance2(); 
		 o1.add();
		 o1.sub(); 
		 A o2=new A();
		 o2.add();
	//x	 o2.sub();  //X
		 
	// we can create an object of child by using parent reference
		 A o3 = new  Inheritance2();
		 o3.add();  //---> parent
		// o2.sub();  //---->child
		
		 //we can't create an object of parent using child  reference
		//Inheritance2 o4 =new A();
		
		
		
	}

}
