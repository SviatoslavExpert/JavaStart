package com.gmail.tsa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = new int[5][6];
		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = rn.nextInt(10);
			}
		}
		saveToFile(array, "array.txt");

	}

	static void saveToFile(int[][] array, String filename) {
		if (array.length == 0) {
			System.out.println("Arrays size = 0 nothing to save");
			return;
		}
		try (PrintWriter pw = new PrintWriter(filename)) {
			for (int[] is : array) {
				for (int i : is) {
					pw.print(i + "\t");
				}
				pw.println();
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("Array saved to " + filename);
	}

}
