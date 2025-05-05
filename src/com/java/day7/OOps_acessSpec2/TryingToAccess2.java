package com.java.day7.OOps_acessSpec2;

import com.java.day7.OOps_acessSpec1.AccessSpe;

public class TryingToAccess2 {
	
	public static void main(String[] args) {
		
		AccessSpe o1=new AccessSpe();
		//if i try to access them in outside the package
		
		System.out.println(o1.pub);
//		System.out.println(o1.pri);
//		System.out.println(o1.def);
//		System.out.println(o1.pro);
	}

}
