package com.java.day5;

public class ForEachArray {

	public static void main(String[] args) {
   
		// 1 3 5 7 9
		
		//1.D
		int arr[]= {1,3,5,7,9};
		
		//ForLoop -> except the last one
//		for(int i=0;i<3;i++)
//		{
//		System.out.println(arr[i]);	
//		}
		
		//Print all the values
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);	
		}
		
		//For Each
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		
		float []fl= {12.5f,133.0f,143.7f};
		
		//enhanced for loop
		
		for(float f:fl)
		{
			System.out.println(f);
		}
		

		
		
		
		
		
	}

}
