package com.gmail.tsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double xa = 0;
		double ya = 0;
		double xb = 4;
		double yb = 4;
		double xc = 6;
		double yc = 1;
		double x;
		double y;
		System.out.println("Input x");
		x = sc.nextDouble();
		System.out.println("Input y");
		y = sc.nextDouble();
		double a = Math.sqrt((xa - xb) * (xa - xb) + (ya - yb) * (ya - yb));
		double b = Math.sqrt((xc - xb) * (xc - xb) + (yc - yb) * (yc - yb));
		double c = Math.sqrt((xa - xc) * (xa - xc) + (ya - yc) * (ya - yc));
		double pa = Math.sqrt((xa - x) * (xa - x) + (ya - y) * (ya - y));
		double pb = Math.sqrt((xb - x) * (xb - x) + (yb - y) * (yb - y));
		double pc = Math.sqrt((xc - x) * (xc - x) + (yc - y) * (yc - y));
		double p = (a + b + c) / 2.0;
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		p = (a + pa + pb) / 2.0;
		double s1 = Math.sqrt(p * (p - a) * (p - pb) * (p - pa));
		p = (b + pc + pb) / 2.0;
		double s2 = Math.sqrt(p * (p - b) * (p - pb) * (p - pc));
		p = (c + pa + pc) / 2.0;
		double s3 = Math.sqrt(p * (p - c) * (p - pc) * (p - pa));
		System.out.println((Math.abs(s - (s1 + s2 + s3)) < 1e-15) ? "YES" : "NO");
		sc.close();

	}

}
