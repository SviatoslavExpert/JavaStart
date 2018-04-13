package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Input number and press Enter");
		number = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < number; j++) {
				if (j % 2 == 0) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
