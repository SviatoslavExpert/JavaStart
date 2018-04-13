package com.gmail.tsa;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFolderInfo("/home/alexander/Документы/Java Progect");
	}

	static void printFolderInfo(String foldername) {
		File folder = new File(foldername);
		if (!folder.exists() || !folder.isDirectory()) {
			System.out.println("Illegals arguments");
			return;
		}
		String[] filelist = folder.list();
		for (String filename : filelist) {
			File tempfile = new File(folder, filename);
			if (tempfile.isDirectory()) {
				System.out.println(filename);
			}
		}
	}

}
