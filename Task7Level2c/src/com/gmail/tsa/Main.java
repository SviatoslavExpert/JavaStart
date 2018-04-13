package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input line");
		String a = sc.nextLine();
		System.out.println(minNumber(a));
		sc.close();
	}

	static String minNumber(String a) {
		int min = 1;
		String minnum = "";
		for (; min <= a.length() / 2;) {
			minnum = a.substring(0, min);
			boolean f = true;
			for (int i = min; i < a.length(); i = i + min) {
				if (minnum.compareTo(a.substring(i, i + min)) != 0) {
					f = false;
					break;
				}
			}
			if (f) {
				break;
			}
			min++;
		}
		return minnum;
	}

}
