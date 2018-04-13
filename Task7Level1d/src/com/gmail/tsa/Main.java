package com.gmail.tsa;

import java.util.Formatter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter fr = new Formatter();
		for (int i = 2; i <= 11; i++) {
			fr.format("%." + i + "f  \n", Math.PI);
		}
		System.out.println(fr.toString());
		fr.close();
	}
}
