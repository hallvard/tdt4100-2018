package of9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileManager {
	public static String read(String path, CaesarCipher cipher) {
		String s = "";
		Scanner sc = null;
		try {
			sc = new Scanner(new File(path));
			while(sc.hasNextLine()) {
				s += cipher.decrypt(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		return s;
	}
	
	public static void write(String input, String path, CaesarCipher cipher) {
		String encrypted = cipher.encrypt(input);
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File(path));
	;		pw.append(encrypted);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
	}
	
	public static void main(String[] args) {
		CaesarCipher cipher = new CaesarCipher(5);
		write("Dette er en fil", "src/of9/encrypted.txt", cipher);
		String res = read("src/of9/encrypted.txt", cipher);
		System.out.println(res);
	}
}
