package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class PersonReader {

	public static void main(String[] args) throws IOException {
		Reader reader = new InputStreamReader(new FileInputStream("/Applications/eclipse/tdt4100-2018-master2/git/tdt4100-2018/foreksempel/src/io/persons.txt"), "UTF-8"); // ISO-8859-1
		while (true) {
			int b = reader.read();
			if (b < 0) {
				break;
			}
			System.out.println((char) b);
		}
		reader.close();
	}
}
