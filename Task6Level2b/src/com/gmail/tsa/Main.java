package com.gmail.tsa;

public class Main {

	public static void main(String[] args) {
		int max, maxi, maxj;
		max = 0;
		maxi = 100;
		maxj = 100;
		long t = System.currentTimeMillis();
		for (int i = 999; i > 100; i--) {
			for (int j = i; j > 100; j--) {
				if (((i * j) % 11 == 0 && (i * j) > max)) {
					if (ifPolindrome(i * j)) {
						max = i * j;
						maxi = i;
						maxj = j;
					}
				}
			}
		}
		System.out.println((System.currentTimeMillis() - t) + " ms");
		System.out.println("Max Polindrome: " + max + " =" + maxi + "*"
				+ maxj);

	}
	

	static boolean ifPolindrome(int x) {
		int m, p;
		m = x;
		p = 0;
		for (; m > 0;) {
			p = p * 10 + m % 10;
			m = m / 10;
		}
		if (p == x)
			return true;
		else
			return false;
	}
}