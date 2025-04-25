package com.java.day6_OOPs;

public class Employe {
	
	int id;
	float salary;
	char fChar;
	boolean isPermenent;
	
	public static void main(String[] args) {
		Employe e1=new Employe();
		Employe e2=new Employe();
		Employe e3=new Employe();
		
		e1.id=12;
		e2.id=13;
		e3.id=15;
		e1.salary=22.5001f;
		e3.salary=22.564f;
		e3.isPermenent=true;
		
		System.out.println("Employ1 Sal "+e1.salary);
	}

}
