package com.examples.stringprograms;

public class ConvertToUpper {

	public static void main(String[] args) {
		// Method 1
		String str1 = "java programming";
		System.out.println(str1.toUpperCase());
		
		// Method 2
		String input = "java is best";

		char strArr[] = input.toCharArray();
		for (int i = 0; i < strArr.length; i++) {
			// here is the actual logic
			if (strArr[i] >= 'a' && strArr[i] <= 'z') {
				strArr[i] = (char) ((int) strArr[i] - 32);
			}
		}
		System.out.println(strArr);

	}

}
