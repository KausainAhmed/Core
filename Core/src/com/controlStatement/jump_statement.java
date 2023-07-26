package com.controlStatement;

public class jump_statement {
	public static void main(String[] args) {
		System.out.println("break at 8 ");
		for (int i = 1; i <= 10; i++) {
			
			if (i == 8) {
				break;
			} else {
				System.out.println(i);
			}
		}
		System.out.println();
		System.out.println("continue at 8");

		for (int i = 1; i <= 10; i++) {
			
			if (i == 8) {
				continue;
			} else {
				System.out.println(i);
			}
		}

	}
}
