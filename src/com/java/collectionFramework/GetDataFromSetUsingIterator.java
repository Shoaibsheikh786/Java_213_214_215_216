package com.java.collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class GetDataFromSetUsingIterator {

	public static void main(String[] args) {
		
	//	List<Double> d1=new ArrayList<>();//tuple
       
		Set<Integer> s1=new LinkedHashSet<Integer>();
		//HashSet-->       insertion order will not be preserved
		//LinkedHashSet--> insertion order will be preserved
		s1.add(10);
		s1.add(8);
		s1.add(44);
		s1.add(10);
		s1.add(44);
		s1.add(34);
		s1.remove(34);
		//1.-> convert set to List 
		//2. Iterator();
		Iterator <Integer> i1=	s1.iterator();
          //i1.get(0);
//		System.out.println(i1.next());
//		System.out.println(i1.next());
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		//*****************
		
//		System.out.println(s1.contains(44));;
		
	}

}
