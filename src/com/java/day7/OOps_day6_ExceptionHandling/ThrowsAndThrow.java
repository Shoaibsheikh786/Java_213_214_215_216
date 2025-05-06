package com.java.day7.OOps_day6_ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsAndThrow {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("HI ");
		File file=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Java_213_214_215_216\\src\\file2.txt");
		FileInputStream fis=new FileInputStream(file);
		System.out.println("This is java");
	}

}
