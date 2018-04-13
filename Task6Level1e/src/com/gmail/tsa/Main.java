package com.gmail.tsa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculateWords("Hello world"));
	}

	static int calculateWords(String text) {
		if (text.length() == 0) {
			return 0;
		}
		String[] words = text.split("[ ,.!?-]");

		return words.length;
	}

}
