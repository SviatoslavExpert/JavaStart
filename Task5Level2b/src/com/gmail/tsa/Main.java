package com.gmail.tsa;

public class Main {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7};
		for (int t : arr) {
			System.out.print(t + " ");
		}
		System.out.println();

		int temp = 0;

		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - (1 + i)];
			arr[arr.length - (1 + i)] = temp;
		}

		for (int t : arr) {
			System.out.print(t + " ");
		}

	}

}
