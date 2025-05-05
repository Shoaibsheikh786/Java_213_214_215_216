package com.java.day7.OOps_acessSpec1;

public class AccessSpe {
	public int pub = 12;
	private int pri = 13;
	protected int pro = 14;
	int def = 15;
	
	private void pub_PrintAllvariables()
	{
		System.out.println(pub);
		System.out.println(pri);
		System.out.println(pro);
		System.out.println(def);
	}
	
//	public static void main(String[] args) {
//	AccessSpe o1=new AccessSpe();
//	System.out.println(o1.pub);
//	System.out.println(o1.pri);
//	System.out.println(o1.pro);
//	System.out.println(o1.def);
//	}

}
