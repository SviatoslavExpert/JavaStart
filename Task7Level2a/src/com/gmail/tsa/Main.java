package com.gmail.tsa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date date1 = new Date();
		Date date2 = new Date();
		System.out.println("Input date (dd:mm:yyyy)");
		String dateline = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy");
		try {
			date2 = sdf.parse(dateline);
		} catch (ParseException e) {
			System.out.println("ERROR");
		}
		String d1 = sdf.format(date1);
		String d2 = sdf.format(date2);
		System.out.println(d1);
		System.out.println(d2);

		if (d1.substring(6).compareTo(d2.substring(6)) != 0) {
			System.out.println(Math.abs(Integer.valueOf(d1.substring(6))
					- Integer.valueOf(d2.substring(6)))
					+ " years");
		}
		if (d1.substring(3, 5).compareTo(d2.substring(3, 5)) != 0) {
			System.out.println(Math.abs(Integer.valueOf(d1.substring(3, 5))
					- Integer.valueOf(d2.substring(3, 5)))
					+ " month");
		}
		sc.close();

	}
}
