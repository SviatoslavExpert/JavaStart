package com.gmail.tsa;

public class Main {

	public static void main(String[] args) {
		int temp;
		int[][] a = { { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 },
				{ 1, 2, 3, 4, 5, 6 }, { 1, 2, 3, 4, 5, 6 } };

		System.out.println();
		System.out.println("Base array");
		System.out.println();

		for (int[] k : a) {
			for (int j : k) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		for (int rot = 0; rot < 3; rot++) {
			for (int i = 0; i < a.length / 2; i++) {
				for (int j = i; j < a.length - 1 - i; j++) {
					temp = a[i][j];
					a[i][j] = a[a.length - 1 - j][i];
					a[a.length - 1 - j][i] = a[a.length - 1 - i][a.length - 1 - j];
					a[a.length - 1 - i][a.length - 1 - j] = a[j][a.length - 1 - i];
					a[j][a.length - 1 - i] = temp;
				}
			}

			System.out.println();
			System.out.println("Rotate " + (90 * (rot + 1)) + " deg");
			System.out.println();

			for (int[] k : a) {
				for (int j : k) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}

		System.out.println();

	}

}