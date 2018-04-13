package com.gmail.tsa;

public class Main {
	public static void main(String[] args) {
		drawRectangle(5, 7);
	}

	static void drawRectangle(int a, int b) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (i == 0 || i == a - 1 || j == 0 || j == b - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}
