package com.gmail.tsa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array = loadArrayFromFile("array.txt");
		for (int[] is : array) {
			for (int i : is) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}

	}

	static int[][] loadArrayFromFile(String filename) {
		File fload = new File(filename);
		if (!fload.exists() || fload.isDirectory()) {
			System.out.println("File not found. Return zero size array");
			return new int[0][0];
		}
		int i = 0;
		int j = 0;
		int[][] array = new int[calculateArraysSize(fload)[0]][calculateArraysSize(fload)[1]];
		try (BufferedReader br = new BufferedReader(new FileReader(fload))) {
			String templine = "";
			for (; (templine = br.readLine()) != null;) {
				String[] cols = templine.split("[\t]");
				for (String rows : cols) {
					array[i][j++] = Integer.valueOf(rows);
				}
				i++;
				j = 0;
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return array;
	}

	static int[] calculateArraysSize(File afile) {
		int[] array = { 0, 0 };
		int n = 0;
		int k = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(afile))) {
			String templine = "";
			for (; (templine = br.readLine()) != null;) {
				n = templine.split("[\t]").length;
				k++;
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		array[0] = k;
		array[1] = n;
		return array;
	}

}
