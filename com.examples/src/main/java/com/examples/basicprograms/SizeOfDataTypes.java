package com.examples.basicprograms;

// Reference
// https://techstudy.org/CLanguage/C-Program-to-find-the-Size-of-data-types

public class SizeOfDataTypes {

	public static void main(String[] args) {		

		System.out.println(" size of byte in Java is (in bytes) : " + sizeof(byte.class));
		System.out.println(" size of short in Java is (in bytes) :" + sizeof(short.class));
		System.out.println(" size of char in Java is (in bytes) :" + sizeof(char.class));
		System.out.println(" size of int in Java is (in bytes) :" + sizeof(int.class));
		System.out.println(" size of long in Java is (in bytes) :" + sizeof(long.class));
		System.out.println(" size of float in Java is (in bytes) :" + sizeof(float.class));
		System.out.println(" size of double in Java is (in bytes) :" + sizeof(double.class));
	}
}
