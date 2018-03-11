package of9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class CommonExceptions {
	public static void classCast(Object o) {
		System.out.println((int)o);
	}
	
	public static void indexOutOfBounds() {
		int[] a = new int[] {1, 2, 3};
		System.out.println(a[3]);
	}
	
	public static void io() throws FileNotFoundException {
		File f = new File("tmp.tmp");
		Scanner sc = new Scanner(f);
	}
	
	public static void io2() throws IOException {
		Reader r = new FileReader("src/of9/file.txt");
		r.close();
		r.read();
	}
	
	public static int thisOnlyWorksWithPositiveNumbers(int n) {
		if (n < 0) throw new IllegalArgumentException("Number is not positive!");
		return n;
	}
	
	public static void main(String[] args) throws IOException {
		String s = "Hei";
		try{
			classCast(s);
		} catch (ClassCastException e) {
			
		} catch (Exception e) {
			System.out.println("dfdsaf");
		} finally {
			
		}
		// indexOutOfBounds();
		io();
		// thisOnlyWorksWithPositiveNumbers(-4);
		// io2();
		System.out.println(CommonExceptions.class.getResource("/of9/file.txt").getPath());
	}
}
