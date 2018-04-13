package com.gmail.tsa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String line = loadFromFile("a.txt");
		printStatistic(line);

	}

	static String loadFromFile(String filename) {
		String temp = "";
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			for (; (temp = br.readLine()) != null;) {
				sb.append(temp);
			}
		} catch (IOException e) {
			System.out.println("Error");
		}
		return sb.toString();
	}

	static int letters(String letters, String text) {
		int lettersnum = 0;
		for (int i = 0; i <= text.length() - 1; i++) {
			if (text.substring(i, i + 1).compareToIgnoreCase(letters) == 0) {
				lettersnum++;
			}
		}
		return lettersnum;
	}

	static void printStatistic(String text) {
		int[] letn = new int[26];
		char[] let = new char[26];
		int j = 0;
		for (char i = 'a'; i <= 'z'; i++) {
			let[j] = i;
			letn[j] = letters(String.valueOf(i), text);
			j++;
		}
		for (int i = 0; i < letn.length; i++) {
			for (int k = i; k < letn.length; k++) {
				if (letn[i] < letn[k]) {
					int temp = letn[i];
					char templ = let[i];
					letn[i] = letn[k];
					let[i] = let[k];
					letn[k] = temp;
					let[k] = templ;
				}
			}
		}
		for (int i = 0; i < let.length; i++) {
			if (letn[i] > 0) {
				System.out.println(let[i] + "\t" + letn[i]);
			}
		}

	}
}
