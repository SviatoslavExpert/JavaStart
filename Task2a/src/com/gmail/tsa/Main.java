package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Input number");
		number = sc.nextInt();

		int partOne = number / 10000;
		int partTwo = number % 10000 / 1000;
		int partThree = number % 1000 / 100;
		int partFour = number % 100 / 10;
		int partFive = number % 10 / 1;

		System.out.println(partOne);
		System.out.println(partTwo);
		System.out.println(partThree);
		System.out.println(partFour);
		System.out.println(partFive);

		sc.close();
	}

}
