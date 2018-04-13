package com.gmail.tsa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Type text. For exit type 'Exit'");
		try (PrintWriter pw = new PrintWriter("a.txt")) {
			String temp = "";
			temp = sc.nextLine();
			for (; temp.compareTo("exit") != 0;) {
				pw.println(temp);
				temp = sc.nextLine();
			}

		} catch (IOException e) {
			System.out.println("ERROR");
		}
		sc.close();
		System.out.println("Done");
	}

}
