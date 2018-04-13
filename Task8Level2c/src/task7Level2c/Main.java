package task7Level2c;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saveAsciiArt("a.txt");
	}

	static void saveAsciiArt(String filename) {
		try (PrintWriter pw = new PrintWriter(filename)) {
			for (int i = 0; i < 40; i++) {
				for (int j = 0; j < 40; j++) {
					pw.print(((j+i) % 3 == 0) ? ("X") : (((j+i) % 3) == 1) ? ("O") : ("*"));
				}
				pw.println();
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
