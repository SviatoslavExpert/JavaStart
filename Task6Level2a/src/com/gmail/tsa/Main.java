package com.gmail.tsa;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = "";
		System.out.println("Input secquince");
		line = sc.nextLine();
		int[] mass = stringToarray(line);
		System.out.println(Arrays.toString(mass));
		System.out.println(sequinseanalis(mass));
		sc.close();

	}

	static int[] stringToarray(String a) {
		String[] arr = a.split("[,]");
		int[] mass = new int[arr.length];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = Integer.valueOf(arr[i]);
		}
		return mass;
	}

	static int[] sdvig(int[] mass) {
		int[] arr = new int[mass.length - 1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = mass[i + 1] - mass[i];
		}
		return arr;
	}

	static boolean isSame(int[] mass) {

		for (int temp : mass) {
			if (temp != mass[0]) {
				return false;
			}
		}
		return true;
	}

	static int arif(int[] mass) {
		int n = -1;
		if (isSame(sdvig(mass))) {
			n = mass[mass.length - 1] + sdvig(mass)[0];
		}
		return n;

	}

	static int geom(int[] mass) {
		int n = -1;
		if (mass[0] != 0) {
			int[] arr = new int[mass.length - 1];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = mass[i + 1] / mass[i];
				if (mass[i + 1] % mass[i] != 0) {
					return n;
				}
			}
			if (isSame(arr)) {
				n = mass[mass.length - 1] * arr[0];
			}
		}
		return n;
	}

	static int stepen(int[] mass) {
		int n = -1;
		if (mass[0] != 0) {
			int[] arr = new int[mass.length];
			System.arraycopy(mass, 0, arr, 0, mass.length);
			for (int i = 0; i < mass.length - 1; i++) {
				arr = sdvig(arr);
				if (isSame(arr)) {
					n = (int) Math.pow((mass.length + 1), (i + 1));
					break;
				}
			}
		}
		return n;
	}

	static int sequinseanalis(int[] mass) {
		int n = -1;
		if ((n = arif(mass)) != -1) {
			return n;
		} else if ((n = geom(mass)) != -1) {
			return n;
		} else if ((n = stepen(mass)) != -1) {
			return n;
		}
		return n;
	}
}