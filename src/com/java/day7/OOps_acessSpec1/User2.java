package com.java.day7.OOps_acessSpec1;

public class User2 {
	
	private String username; //directly can't be accessible
	private String password;
	
  //Encapsulation: 
	public void setUsername(String u1)
	{
		username=u1;
	}
	public void setPassword(String p1)
	{
		password=p1;
	}
	public String getUsername()
	{
		String s=username;
		return s;
	}
	public String getPassword()
	{
		return password;
	}
	
	

}
