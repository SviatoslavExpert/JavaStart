package com.gmail.tsa;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(a) + " - Standart");
		System.out.println(arrayToString(a) + " - My version");
	}

	static String arrayToString(int[] a) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < a.length - 1; i++) {
			sb.append(a[i] + ", ");
		}
		if (a.length != 0) {
			sb.append(a[a.length - 1]);
		}
		sb.append("]");
		return sb.toString();
	}
}
