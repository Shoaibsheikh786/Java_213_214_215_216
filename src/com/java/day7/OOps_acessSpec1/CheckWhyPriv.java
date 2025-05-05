package com.java.day7.OOps_acessSpec1;

public class CheckWhyPriv {
	
	public static void main(String[] args) {
		Calculator c1=new Calculator();
		//assingn 
		
	    c1.setAB(100, 10);
	    c1.div();
		
		// 100/0 :-> Error 
	}

}
