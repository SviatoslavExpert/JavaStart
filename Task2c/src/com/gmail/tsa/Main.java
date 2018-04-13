package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r;
		System.out.println("Input r");
		r = sc.nextDouble();
		double p;
		p = 2.0 * Math.PI * r;
		System.out.println("Perimetr = " + p);
		sc.close();
	}
}
