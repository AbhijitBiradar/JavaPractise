package com.examples.conditionalprograms;

import java.util.Scanner;

public class EligibilityForVote {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your age!");
		int age = scan.nextInt();

		if (age >= 18) {
			System.out.println("Candidate is eligible for voting!");
		} else {
			System.out.println("Candidate is not eligible for voting!");
		}
	}
}
