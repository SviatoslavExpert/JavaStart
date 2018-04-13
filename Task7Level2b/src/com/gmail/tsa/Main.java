package com.gmail.tsa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculateHemingsLength(117, 17));

	}

	static int calculateHemingsLength(int a, int b) {
		int n = 0;
		int c = a ^ b;
		for (; c > 0;) {
			n +=(c & 1);
			c >>= 1;
		}
		return n;
	}

}
