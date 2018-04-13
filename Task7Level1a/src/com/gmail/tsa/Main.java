package com.gmail.tsa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cl = Calendar.getInstance();
		Calendar cl1 = Calendar.getInstance();

		cl1.set(Calendar.MONTH, cl.get(Calendar.MONTH) - 1);

		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
		System.out.println(sdf.format(cl.getTime()));
		System.out.println(sdf.format(cl1.getTime()));
		
		Date dateOne = cl.getTime();
		Date dateTwo = cl1.getTime();

		long t = dateOne.getTime() - dateTwo.getTime();
		System.out.println(t + " ms ");

	}
}
