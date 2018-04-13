package com.gmail.tsa;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[15];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 11);
		}

		int[] b = new int[a.length * 2];

		for (int i = 0; i < b.length; i++) {
			if (i < a.length) {
				b[i] = a[i];
			} else {
				b[i] = 2 * a[i - a.length];
			}
		}

		System.out.println(Arrays.toString(a));
		System.out.print(Arrays.toString(b));
	}

}