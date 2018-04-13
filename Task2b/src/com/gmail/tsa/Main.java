package com.gmail.tsa;

public class Main {

	public static void main(String[] args) {

		double sideA = 0.3;
		double sideB = 0.5;
		double sideC = 0.4;

		double halfP = (sideA + sideB + sideC) / 2.0;

		double area = Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
		System.out.println("Area = " + area);
	}
}
