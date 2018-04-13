package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Input number");
		number = sc.nextInt();
		int n1 = number / 1000;
		int n2 = number % 1000 / 100;
		int n3 = number % 100 / 10;
		int n4 = number % 10;
		if ((n1 + n2) / 10 + (n1 + n2) % 10 == (n3 + n4) / 10 + (n3 + n4) % 10) {
			System.out.println(number + " is lucky number");
		} else {
			System.out.println(number + " is not lucky number");
		}
		sc.close();
	}

}
