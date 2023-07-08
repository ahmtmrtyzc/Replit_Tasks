package com.neotech.lesson16;

import java.util.Scanner;

public class Student {
	// Create a class Student that will have a method getGrade.
	// your method should accept the score of a student and return a grade:

	// What is the return type ?? Char
	// What is the name of the method?? getGrade()
	// What are the inputs?? int score

	char getGrade(int score) {
		char grade;
		if (score > 90) {
			grade = 'A';
		} else if (score > 80) {
			grade = 'B';

		} else if (score > 70) {
			grade = 'C';

		} else if (score > 50) {
			grade = 'D';

		} else {
			grade = 'F';

		}

		return grade;

	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the score");
		int score = input.nextInt();
		Student st = new Student();
		char results  =st.getGrade(score);
		System.out.println("Student get a grade "+results);
	}

}
