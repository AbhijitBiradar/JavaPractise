package com.examples.stringprograms;

import java.util.Scanner;

// Refer
// https://quescol.com/interview-preparation/count-alphabets-digits-special-characters-in-string-using-java

public class CountCharacters {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		String str = scan.nextLine();		
		
		int alphabet = 0, digit = 0, symbol = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				alphabet++;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				digit++;
			} else {
				symbol++;
			}
		}
		System.out.println("alphabet = " + alphabet + " Digit = " + digit + " Symbol = " + symbol);

	}

}
