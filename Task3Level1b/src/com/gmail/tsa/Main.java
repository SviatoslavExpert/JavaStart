package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int floor = 0;
		int access = 0;
		System.out.println("Input number and press Enter");
		number = sc.nextInt();

		if (number > 0 && number <= 4 * 9 * 4) {
			access = (number - 1) / 36 + 1;
			number = number - 36 * (access - 1);
			floor = (number - 1) / 4 + 1;
			System.out.println("Access - " + access);
			System.out.println("Floor - " + floor);
		} else {
			System.out.println("There is no such apartment");
		}
		sc.close();

	}

}
