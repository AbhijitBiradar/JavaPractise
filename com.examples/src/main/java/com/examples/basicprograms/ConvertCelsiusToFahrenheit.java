package com.examples.basicprograms;

import java.util.Scanner;

// REference
// https://techstudy.org/CLanguage/C-Program-to-convert-celcius-to-farenheit

public class ConvertCelsiusToFahrenheit {

	public static void main(String[] args) {
		double celsius, fahrenheit;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter Temperature in Celsius :");
		celsius=scan.nextFloat();
		
		fahrenheit = (1.8 * celsius) + 32;
		
		System.out.println("Temperature in Fahrenheit :" + fahrenheit);
		
		scan.close();
	}
}
