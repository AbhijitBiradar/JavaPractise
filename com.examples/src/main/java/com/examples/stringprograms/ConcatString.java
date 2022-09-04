package com.examples.stringprograms;

import java.util.StringJoiner;

// Refer
// https://www.javatpoint.com/string-concatenation-in-java
public class ConcatString {

	public static void main(String[] args) {

		// Method 1
		String str1 = "Abhijit";
		String str2 = "Biradar";

		String str3 = str1 + str2;

		System.out.println(str3);

		// Method 2
		String str4 = str1.concat(str2);

		// Method 3
		StringBuilder s1 = new StringBuilder("Hello");
		StringBuilder s2 = new StringBuilder(" World");
		StringBuilder s = s1.append(s2);
		System.out.println(s.toString());

		// Method 4
		String s3 = new String("Hello");
		String s4 = new String(" World");
		String s5 = String.format("%s%s", s3, s4);
		System.out.println(s.toString());

		// Method 5
		String s6 = new String("Hello");
		String s7 = new String(" World");
		String s8 = String.join("", s6, s7);
		System.out.println(s.toString());

		// Method 6
		StringJoiner s9 = new StringJoiner(", ");
		s9.add("Hello"); // String 1
		s9.add("World"); // String 2
		System.out.println(s9.toString());

	}

}
