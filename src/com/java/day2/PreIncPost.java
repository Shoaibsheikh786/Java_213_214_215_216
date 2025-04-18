package com.java.day2;

public class PreIncPost {

	public static void main(String[] args) {
       
		//++
		// ++ a-> pre-inc
		// a ++ -> post-inc
		
		int a=10;
		int b=a++;  //post inc -> least Priority
		
		System.out.println(a); //11
		System.out.println(b); //10
		
		int x=10;  //11
		int y=++x; //pre -inc -> has high priority
		System.out.println(x);
		System.out.println(y);
	}

}
