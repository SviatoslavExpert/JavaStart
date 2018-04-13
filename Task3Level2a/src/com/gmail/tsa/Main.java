package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = 4.0;
		double x;
		double y;
		System.out.println("Input x");
		x = sc.nextDouble();
		System.out.println("Input y");
		y = sc.nextDouble();

		if (x * x + y * y <= r * r) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

}
