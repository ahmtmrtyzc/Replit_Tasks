package com.neotech.lesson17;

public class RemoveSpace {
	public static void main(String[] args) {
		// Create String that will hold a sentence
		// Write a program to get a new String without any spaces.

		String str = " So sorry we did not cover replace methods!";
		String str2 = str.replace(" ", "");
		System.out.println(str2);
		System.out.println("old-> " + str + " lenght: " + str.length());
		System.out.println("new-> " + str2 + " lenght: " + str2.length());
	}

}
