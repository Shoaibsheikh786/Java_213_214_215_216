package com.java.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class UnderstandingCollectionFramework {
	
	
	public static void main(String[] args) {
		//1 44 55 21 77 55 1 3 66...
		//2.4f 34.f
		//"shell" , "ansible", "docker",
		//Type of int-> 
		//int --> Integer
		//flaot-> Float
		//boolean -> Boolean 
		
		//.Type of data :int -> Integer
		//List, Set, Queue,
		//Can i create an object of list -> X
		//Classname<TypeOfData> ref=new Classname<TypeOfData>();
		
//		ArrayList<Integer> l1=new ArrayList<Integer>();
		//1 44 55 21 77 55 1 3 66...
		
//		int arr[]=new int[9];
//		arr[0]=1;
//		arr[1]=44;
//		arr[2]=21;
		
	//	System.out.println(arr[0]);
//		int c=arr[0];
//		System.out.println(c);
		
//		LinkedList<Integer> l1=new LinkedList<Integer>();
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(44);
		l1.add(55);
		l1.add(21);
		l1.add(44);
		l1.add(1);
		l1.add(105);
		
		for(int i=0;i<l1.size();i++)
		{
			int c=l1.get(i);
		    System.out.println(c);
		}
		
		
		
		
		
	    
	}

}
