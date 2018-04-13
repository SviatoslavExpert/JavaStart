package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String dollars = "";
		Scanner sc = new Scanner(System.in);
		String[] numarr = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] numdecarr = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		System.out.println("How much money do you have?");
		String[] money = sc.nextLine().split("[,.]");
		if (money[0].length() > 9) {
			System.out.println("You're a very rich man");
		} else {
			int m = Integer.valueOf(money[0]);
			int n1 = m / 1_000_000;
			int n2 = m % 1_000_000 / 1000;
			int n3 = m % 1000;
			int[] moneyarray = { n1, n2, n3 };
			for (int j = 0; j < moneyarray.length; j++) {
				int t = moneyarray[j];
				if (t != 0) {
					dollars += (t / 100 > 0) ? (numarr[t / 100] + " hundred ") : "";
					dollars += ((t % 100) > 19) ? (numdecarr[(t % 100) / 10] + " " + numarr[(t % 100) % 10] + " ") : "";
					dollars += ((t % 100) > 0 && t % 100 <= 19) ? (numarr[(t % 100)] + " ") : "";
					dollars += (j == 0) ? " million " : "";
					dollars += (j == 1) ? " thousand " : "";
				}
			}
			dollars += (m > 0) ? (" dollars ") : "";
			if (money.length > 1) {
				int cen = Integer.valueOf(money[1].substring(0, money[1].length()));
				cen = ((money[1].length() == 1)) ? cen * 10 : cen;
				if (cen > 0) {
					dollars += (cen / 10 > 1) ? (numdecarr[(cen / 10)] + " " + numarr[cen % 10] + " cents")
							: (numarr[cen] + " cents");
				}
			}
			System.out.println("You have: " + dollars);
			sc.close();
		}
	}
}
