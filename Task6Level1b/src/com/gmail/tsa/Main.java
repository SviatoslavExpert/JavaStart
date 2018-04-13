package com.gmail.tsa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t = concatMet(3, 3.5, "summa = ");
		System.out.println(t);
	}

	static String concatMet(int a, double b, String c) {
		c = c + (a + b);
		return c;
	}
}
