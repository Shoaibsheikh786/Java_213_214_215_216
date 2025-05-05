package com.java.day7.OOps_acessSpec1;

public class AccessPrivateVariables {
	
	public static void main(String[] args) {
		//set username as shoaib
		//set password as password@123
		
		User2 o1=new User2();
//		o1.username="shoaib";
		o1.setUsername("shaoib");
		
//		o1.password="password@123";
		o1.setPassword("password@123");
		
		//print the username and password
	//	System.out.println(o1.username);
		String u=o1.getUsername();
		System.out.println("username -> "+u);
		
		System.out.println("Password -> "+o1.getPassword());
		
		
	}

}
