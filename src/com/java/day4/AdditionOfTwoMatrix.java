package com.java.day4;

public class AdditionOfTwoMatrix {

	public static void main(String[] args) {
   
		//initialize an array 
		//1.D
	//	int arr[]= {1,5,3,8};
		
		//2.D
		int arr1[][]= {
				{1,4,5},
				{2,7,8}
		};
		
		int arr2[][] = {
				{1,5,3},
				{2,8,9}
		};
		
		int arr3[][]=new int[2][3];
		
		arr3[0][0]=arr1[0][0]+arr2[0][0];
		arr3[0][1]=arr1[0][1]+arr2[0][1];
		arr3[0][2]=arr1[0][2]+arr2[0][2];
		
//	arr3[0][0]=arr1[0][0]+arr2[0][0];
		
	//2.-> row, column
		
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			arr3[i][j]=arr1[i][j]+arr2[i][j];
		}
	}
	
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(arr3[i][j]+ " ");
		}
		System.out.println();
	}
	
	
	
		
		
	}

}
