package com.java.day6_OOPs;

public class Class2 {

	public static void main(String[] args) {
     
		/*
		 * s1->[21, 109, a, true]
           s2->[22, 134, s, false]
        */
		
		//1. We need to object 
		//Name-> Student
		
		Student s1=new Student();
		Student s2=new Student();
		
		s1.id=21;
		s1.roll_no=109;
		s1.fChar='a';
		s1.fee=true;
		
		
		s2.id=22;
		s2.roll_no=134;
		s2.fChar='s';
		s2.fee=false;
	}

}
