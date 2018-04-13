package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int n;
		System.out.println("Input max heigth");
		n = sc.nextInt();

		for (; i < (2 * n - 1);) {
			if (j >= (n - Math.abs(n - i))) {
				System.out.println();
				i++;
				j = 0;
			}
			System.out.print("*");
			j++;
		}

		sc.close();

	}

}
