package com.examples.basicprograms;

import java.util.Scanner;

// Reference
// https://techstudy.org/cLanguage/C-Program-to-Print-ASCII-Value

public class PrintASCIIValue {
	public static void main(String[] args) {
		 char ch;
		 
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("Please enter a character: ");
		 ch=scan.next().charAt(0);
		 
		 int asciiValue=ch;
		 
		 System.out.println("ASCII value " + asciiValue );
		 
		 scan.close();
	}
}
