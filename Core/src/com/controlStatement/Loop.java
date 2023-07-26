package com.controlStatement;

public class Loop {
	static int i, j, k;

	public static void main(String[] args) {

		System.out.println("printing 1-10 using for loop");
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("printing 1-10 using while loop");
		while (j <= 10) {
			System.out.println(j);
			j++;
		}

		System.out.println("printing 1-10 using do-while loop");
		do {
			k++;
			System.out.println(k);
		} while (k < 10);

		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println("printing array 1-5 using for-each");
		for (int i : a) {
			System.out.println(i);
		}
	}
}
