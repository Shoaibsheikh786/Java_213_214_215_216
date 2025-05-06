package com.java.day7.OOps_day6_ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {
	//unexpected event which will break the normal flow of the program

	
	public static void main(String[] args) {
//		int a=100;
//		int b=10;
//		System.out.println("hello ");
//		System.out.println("world");
//		System.out.println(a/b);
//		System.out.println("this ");
//		System.out.println("is java");
//		
		          //0  1   2 
//		int arr[]= {11,21,30};
//		
//		for(int i=0;i<=3;i++)  //i->0,1,2,3
//		{
//			System.out.println("Value -> "+arr[i]);
//		}
//		
	
		//wrong file name
		//file is not present at this location 
		//file is protected 
		// file is corupted 
		//... 
		
		//this code can generate exception
		try
		{  
			File file=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Java_213_214_215_216\\src\\file2.txt");
			FileInputStream fis=new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("if the file is not present ");
			System.out.println("Execute the code ");
		}
		
		
		System.out.println("Hello world ");
		
		
		
		
	}
}
