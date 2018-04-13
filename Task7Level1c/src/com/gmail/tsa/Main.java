package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input binary number");
		int numb = 0;
		char[] num = sc.nextLine().toCharArray();
		for (int i = num.length - 1; i >= 0; i--) {
			numb += Integer.valueOf("" + num[i]) << num.length - i - 1;
		}
		String number = new String(num);
		System.out.println(number + " -> " + numb);
		sc.close();

	}

}
