package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Input a");
		a = sc.nextInt();
		System.out.println("Input b");
		b = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				if (i == 1 || i == a || j == 1 || j == b) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
