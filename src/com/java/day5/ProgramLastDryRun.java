package com.java.day5;

public class ProgramLastDryRun {
	
	public static void main(String[] args) {
		int arr[] = { 1,5,2,4,77,9};
		int a=arr[0];
		int t=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(a<arr[j])
				{
					t=arr[j];
					arr[i]=t;				
				}
			}
		}		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//
		
	}

}
