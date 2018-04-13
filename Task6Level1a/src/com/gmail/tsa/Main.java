package com.gmail.tsa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 2, 5, 1, 0, 2, -3, 12, 0, 7, 34, 2, -68 };
		System.out.println(findMax(array));
	}

	static int findMax(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

}
