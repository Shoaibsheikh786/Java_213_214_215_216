package com.java.day4;

public class KeywordContineuAndBreak {
	
	public static void main(String[] args) {
		
		//contineu -> skip 
		//break , break the loop
		
//		for(int i=0;i<5;i++)
//		{   
//			System.out.println("java");
//			if(i==3)
//			{
//				System.out.println("Hello world");
//			}
//			System.out.println("Selenium");
//			
//		}
		
		for(int i=0;i<5;i++)
		{   
			if(i<3)
			{
				continue;
			}
			System.out.println("Hello world "+i); 
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
