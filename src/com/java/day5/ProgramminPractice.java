package com.java.day5;

public class ProgramminPractice {

	public static void main(String[] args) {
    
		int arr[]= {1,3,5,6,0,14,8,9};	
		int a=0;
		for(int i=1;i<arr.length;i++)
		{
			if(a<arr[1])
			{
				a=arr[i];
			}		
		}
		System.out.println("Value of i "+a);
		
		
		
	}

}
