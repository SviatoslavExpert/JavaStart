package com.gmail.tsa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 0, 4, 2, 7, 10, 0, 3 };
		
		System.out.println(liniarSearch(array, 7));
		System.out.println(liniarSearch(array, 8));

	}

	static int liniarSearch(int[] array, int element) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == element) {
				index = i;
				break;
			}
		}
		return index;
	}

}
