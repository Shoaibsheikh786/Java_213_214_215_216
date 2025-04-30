package com.java.day7.OOps_day5;

public class Strings11 {

	public static void main(String[] args) {
       String str="abcdegiekhbskdke";
       // b
       char ch='b';
       int count=0;
       for(int i=0;i<str.length();i++)
       {
    	char c=   str.charAt(i);
    	if(c==ch)
    	{
    	  count++;	
    	}
       }
       
       System.out.println(count);
	}

}
