package com.exmples.switchcaseprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-C-program-to-print-gender-Male-Female-program

public class PrintGender {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a character for gender:");
		char ch = scan.next().charAt(0);

		switch (ch) {
		case 'm':
		case 'M':
			System.out.println("It's male!");
			break;

		case 'f':
		case 'F':
			System.out.println("It's female!");
			break;
		}

	}
}
