package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Input n");
		n = sc.nextInt();
		long fac = 1L;
		if (4 < n && n < 16) {
			for (int i = 1; i <= n; i++) {
				fac = fac * i;
			}
			System.out.println("" + n + "! = " + fac);
		} else {
			System.out.println("Wrong input");
		}
		sc.close();
	}

}
