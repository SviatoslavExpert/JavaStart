package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Input number");
		number = sc.nextInt();
		int n1 = number / 100_000;
		int n2 = number % 100_000 / 10_000;
		int n3 = number % 10_000 / 1000;
		int n4 = number % 1000 / 100;
		int n5 = number % 100 / 10;
		int n6 = number % 10;

		if (n1 == n6 && n2 == n5 && n3 == n4) {
			System.out.println("Yes " + number + " is palindrome");
		} else {
			System.out.println("No " + number + " is not palindrome");
		}
		sc.close();
	}

}
