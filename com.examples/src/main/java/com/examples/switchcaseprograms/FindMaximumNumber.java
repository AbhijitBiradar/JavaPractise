package com.examples.switchcaseprograms;

import java.util.Scanner;

// Refer
// https://techstudy.org/cLanguage/Write-C-Program-to-find-maximum-number-using-switch-case

public class FindMaximumNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter first number:");
		int firstNumber=scan.nextInt();
		
		System.out.println("Please enter second Number:");
		int secondNumber=scan.nextInt();
		
		switch(firstNumber>secondNumber) {
		case 1:
			System.out.println(firstNumber + " is maximum!");
			break;
		case 0:
			System.out.println(secondNumber + " is maximum!");
		}
	}
}
