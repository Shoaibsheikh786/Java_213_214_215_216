package com.java.day7.OOPs_day3;

class C {
	
	static int z;          //0 
	int a;    //0  //instance 
	void setA(int x) {
		a = x;
	}
	void printA() {
		int a=20;
		System.out.println("Value of a" + a);
	}
	
	void defValue()
	{
		int z;      //blank , empty
		
		System.out.println(a);
	}
}

public class Variabless {
	public static void main(String[] args) {
		C obj1 = new C();
		obj1.printA();
		System.out.println(C.z);
	}
}
