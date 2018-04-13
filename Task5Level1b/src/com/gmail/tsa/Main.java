package com.gmail.tsa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Input array size and press Enter");
		size = sc.nextInt();
		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Input array[" + i + "]");
			array[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(array));
		sc.close();

	}

}
