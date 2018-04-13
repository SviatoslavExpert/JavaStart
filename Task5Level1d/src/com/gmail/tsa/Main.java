package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input string");
		String text = sc.nextLine();

		int num = 0;
		char[] letters = text.toCharArray();

		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == 'b') {
				num += 1;
			}
		}

		System.out.println(num);

		sc.close();
	}
}