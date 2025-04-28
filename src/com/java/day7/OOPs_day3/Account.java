package com.java.day7.OOPs_day3;

public class Account {
	int tBalnce;
	int acc_num;
	char fChar;
	static int intrest=2;
	void printTotalBalance(int a)
	{
		System.out.println(tBalnce);
	}
	void printAccNumber()
	{
		System.out.println(acc_num);
	}
	
	public static void main(String[] args) {
		Account o1=new Account();
		Account o2=new Account();
		
		o2.printAccNumber(); //0
		o2.acc_num=21220;
		o1.printAccNumber();  //0
		o1.acc_num=1210;
	
	}

}
