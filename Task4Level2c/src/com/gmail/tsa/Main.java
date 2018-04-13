package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Input max length");
		n = sc.nextInt();
		if (n % 2 != 0) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (j < (n / 2 - Math.abs(n / 2 - i)) || j > n / 2 + Math.abs(n / 2 - i)) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}

				}
				System.out.println();
			}
		} else {
			System.out.println("Wrong number");
		}
		sc.close();

	}

}
