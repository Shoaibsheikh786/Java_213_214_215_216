package com.java.day4;

public class MulitDimentionalArray {

	public static void main(String[] args) {
    
		/*     0 1 2
		 *     | | |
		 * 0-> 3 5 6
           1-> 2 4 0
            
        */		
	   //MultiDimentional array
		//DataType var[][] = new DataType[No.of_row][no.ofCol];
		
		int arr[][]=new int[2][3];
		arr[0][0]=31880;
		arr[0][1]=599;
		arr[0][2]=6;
		arr[1][0]=2;
		arr[1][1]=4;
		arr[1][2]=0;
		
		
		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
		
		//repeate -> 
		//1. 0,0
		//2. 0,1
		//3. 0,2
		//4. 1,0
		//5, 1,1
		//6, 1,2
	//	System.out.println(arr[0][0]);
		
		for(int i=0;i<2;i++)
		{  
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
