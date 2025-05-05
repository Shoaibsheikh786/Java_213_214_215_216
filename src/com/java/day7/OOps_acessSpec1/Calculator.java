package com.java.day7.OOps_acessSpec1;

public class Calculator {
	private int a;
	private int b;

	public void setAB(int x, int y) {

		// if denminator is 0 , dont divide
		if (y == 0) {
			System.out.println("division is not possible becz denominato is 0");
		} else {
			a = x;
			b = y;
		}

	}

	void add() {
		System.out.println(a + b);

	}

	void div() {
		// this logic if b--> 0
		System.out.println(a / b); // crash the program
		System.out.println("divison method called");
	}

}
