package com.examples.stringprograms;

// Refer
// https://www.javatpoint.com/how-to-reverse-string-in-java

public class ReverseString {

	public static void main(String[] args) {
		// Method 1
		StringBuilder sb = new StringBuilder("Abhijit");
		sb.reverse();
		System.out.println(sb);

		// Method 2
		String str2 = "Biradar";
		char ch[] = str2.toCharArray();
		String reverseStr = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			reverseStr = reverseStr + ch[i];
		}
		System.out.println(reverseStr);

		// Method 3
		String str = "Geeks";
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();

		System.out.println(sbr);
	}
}
