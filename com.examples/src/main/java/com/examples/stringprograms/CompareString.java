package com.examples.stringprograms;

//Refer
// https://www.programiz.com/java-programming/examples/compare-strings
// https://codedost.com/java/strings-in-java/java-program-to-compare-two-strings-without-using-string-method-equals/

public class CompareString {

	public static void main(String[] args) {
		// Method 1
		String style = "Bold";
		String style2 = "Bold";

		if (style == style2) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		// Method 2
		String style3 = new String("Bold");
		String style4 = new String("Bold");

		if (style3.equals(style4)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		// Method 3
		String style5 = "Bold";
		String style6 = "Bold";

		char str1[] = style5.toCharArray();
		char str2[] = style6.toCharArray();

		int flag = 1;

		if (str1.length == str2.length) {
			for (int i = 0; i < str1.length; i++) {
				if (str1[i] != str2[i]) {
					flag = 0;
					break;
				}
			}
		} else {
			flag = 0;
		}

		if (flag == 1) {
			System.out.println("The two string are EQUAL!!!");
			System.out.println(style5 + " = " + style6);
		}

		else {
			System.out.println("The two string are NOT EQUAL!!!");
			System.out.println(style5 + " != " + style6);
		}

	}

}
