package com.java.day7.OOps_day6_AdditionTopics;

public class AdditonlTopic2 {
  
   int a=1;
   int b;
 
	

	public static void main(String[] args) {
       
    String str="jack";
    String str2="jack";
    String str3=new String("jack");
    String str4=new String("jack");
    
    
    System.out.println(str==str2);  //true 
    System.out.println(str==str3);  //false
    System.out.println(str3==str4); //false, 
    
    System.out.println(str.equals(str2)); //true
    System.out.println(str.equals(str3)); //true
    System.out.println(str3.equals(str4)); //true
    
       
	}

}
