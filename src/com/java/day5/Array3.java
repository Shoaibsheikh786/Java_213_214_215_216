package com.java.day5;

public class Array3 {

	public static void main(String[] args) {
    
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=i-2;
		}
		
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.println(arr[j]);
		}
		
		//:-> //   1.-> Error
		      //   2.-> 2 , 1 0 -1 -2 
		      //   3.->  
	}

}
