package com.java.day7.OOps_day6_ExceptionHandling;

public class Account {
	int tBal = 2000;
	int wAmout;

	public void wAmount(int a) {
		wAmout = a;
		try {
			if (wAmout > tBal) {
				// this is an Exception
				throw new Exception();
			}

			tBal = tBal - wAmout;
			System.out.println("Balance " + tBal);

		} catch (Exception e) {
			System.out.println("Insufficient Balance");
		}

	}

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.wAmount(50);
	}

}
