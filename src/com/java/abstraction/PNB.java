package com.java.abstraction;

interface RBI {
	void credit();

	void debit();

}

class SBI implements RBI
{

	@Override
	public void credit() {
		System.out.println("Credit System of SBI");
	}

	@Override
	public void debit() {
		System.out.println("Debit System of SBI");
	}
	
}

public class PNB implements RBI {

	public void credit() {
		System.out.println("Credit System of PNB");
	}

	public void debit() {
		System.out.println("Debit System of PNB");

	}

	public void upi() {
		System.out.println("upi of PNB");
	}
	
	public static void main(String[] args) {
		SBI o1=new SBI();
		PNB o2=new PNB();
		
		o1.credit();
		o2.credit();
	}

}
