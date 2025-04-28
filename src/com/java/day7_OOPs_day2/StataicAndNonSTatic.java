package com.java.day7_OOPs_day2;
class DPS {
	int tStudents = 250;

	static void schoolName() {
		System.out.println("Dps");
	}

	void totalStudents() {
		System.out.println(tStudents);
	}
	
	
}


public class StataicAndNonSTatic {

	public static void main(String[] args) {
	//	DPS.schoolName();
		DPS s1=new DPS();
		DPS s2=new DPS();
		DPS.schoolName();
		s1.totalStudents();
		
	}

}

