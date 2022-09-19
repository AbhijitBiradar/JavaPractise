package com.examples.conditionalprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/C-program-to-find-the-eligibility-of-admission-for-a-engineering-course-based-on-the-criteria

public class EngineeringAdmissionEligibility {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter Physics Marks:");
		int physicsMark = scan.nextInt();

		System.out.println("Please enter Chemistry Marks:");
		int chemistryMark = scan.nextInt();

		System.out.println("Please enter mathemetics marks:");
		int mathMark = scan.nextInt();

		if ((physicsMark >= 55 && chemistryMark >= 50 && mathMark >= 65)
				&& ((physicsMark + chemistryMark + mathMark) >= 180 || (mathMark + physicsMark) >= 140)) {
			System.out.println("Student is eligible for admission");
		} else {
			System.out.println("Student is not eligible for admission");
		}

	}
}
