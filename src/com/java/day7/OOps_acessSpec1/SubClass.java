package com.java.day7.OOps_acessSpec1;

public class SubClass extends AccessSpe{
	
	void checkAllVariables()
	{
		pub=20;  //public we can access in sub class
	//	pri=30;  //private can't be accessible in sub-class
		pro=40;  //protected can be accessible in sub-class
		def=40; //default can be accessible in sub-class
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
