package com.java.collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UnderStandingSet {
	
	//id -> of employees
	//id1-> 312 , 313, 314, 312;
	
	public static void main(String[] args) {
		
		HashSet<Integer> s1=new HashSet<Integer>();
		s1.add(100);
		s1.add(312);
		s1.add(313);
		s1.add(314);
		s1.add(312);
		s1.add(55);
		
		
		//2. Different ways to access set
		//1. convert set to list(list has get)
		//2. iterator();
		
		List<Integer> l1=new ArrayList<Integer>(s1);
		
		for(int i=0;i<l1.size();i++)
		{
			int c=l1.get(i);
		    System.out.println(c);
		}
	}

}
