package com.java.abstraction;

interface i1 {

	int a = 10;

	// abstract methods
	public abstract void addStudent(); // it does not have any code

	public abstract void checkResult();

	void deleteStudent();
}

//in school class we will provide code to all the methods
// of the inherited interface 
public class School implements i1 {
	public void deleteStudent() {
		System.out.println("hello world");
	}

	public void checkResult() {
		System.out.println("some code");
	}

	public void addStudent() {

	}

}
