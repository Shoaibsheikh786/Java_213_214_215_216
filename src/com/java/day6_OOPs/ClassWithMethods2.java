package com.java.day6_OOPs;

public class ClassWithMethods2 {

	// static void methodname(){ code }

	static void myBatchDetails() {
		System.out.println("Batch 213 Details");
		System.out.println("Batch 214 Details");
		System.out.println("Batch 215 Details");
		System.out.println("Batch 216 Details");
	}
	

	public static void main(String[] args) {

		System.out.println("helloworld");
		// Batch 213 214 215 and 216
		myBatchDetails();
		System.out.println("This is other code");
		System.out.println("This is other code 2");
		// print batch details
		myBatchDetails();
		System.out.println("This is other code");
		System.out.println("This is other code 2");
		// print batch details
		myBatchDetails();

	}

}
