package com.assignment_day_one;

public class DecideGrade {
	public static void main(String[] args) {
		int marks = 80;
		
		if(marks >= 70) {
			System.out.println("First Class");
		} else if (marks >= 60) {
			System.out.println("Second Class");
		} else if (marks >= 50) {
			System.out.println("Third Class");
		} else if (marks >= 40) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}
}
