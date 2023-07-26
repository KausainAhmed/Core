package com.controlStatement;

import java.util.Scanner;

public class ATM {
	static float Balance, Withdraw, Deposit, Amount, Amountw;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1 to check Main Balance");
			System.out.println("Enter 2 to deposit money");
			System.out.println("Enter 3 to wihdraw money");
			System.out.println("Enter 4 to exit");

			int ui = scanner.nextInt();

			switch (ui) {
			case 1:
				System.out.println("Your main account balance is " + Balance);
				break;

			case 2:
				System.out.println("Enter amount to deposit");
				Amount = scanner.nextFloat();
				Balance = Balance + Amount;
				System.out.println("Your updated balance is " + Balance);
				break;

			case 3:
				System.out.println("Enter amount to withdraw");
				Amountw = scanner.nextFloat();
				if (Amountw > Balance) {
					System.out.println("Isufficient Balance");
					System.out.println("You have " + Balance + " left");
				} else {
					Balance = Balance - Amountw;
					System.out.println("You have " + Balance + " left");
				}
				break;

			case 4:
				System.out.println("Thankyou for banking with us \n Have a great day");
				System.exit(1);
			}
			System.out.println();
			System.out.println();
		}
	}
}