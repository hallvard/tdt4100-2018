package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class PersonReader {

	public Collection<Person> readPersonData(InputStream inputStream) {
		Collection<Person> result = new ArrayList<Person>();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
			while (reader.ready()) {
				String line = reader.readLine();
				if (line.startsWith("#")) {
					continue;
				}
				Person person;
				try {
					person = new Person();
					String[] properties = line.split(",");
					for (String property : properties) {
						int pos = property.indexOf(':');
						String propertyName = property.substring(0, pos).trim();
						String propertyValue = property.substring(pos + 1).trim();
						if ("name".equals(propertyName)) {
							person.setName(propertyValue);
						} else if ("email".equals(propertyName)) {
							person.setEmail(propertyValue);
						}
					}
					result.add(person);
				} catch (IllegalArgumentException | StringIndexOutOfBoundsException e) {
					System.err.println("Syntax error: " + line);
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return result;
	}
	
	public static void main(String[] args) {
		PersonReader pr = new PersonReader();
		try {
			Collection<Person> persons = pr.readPersonData(new FileInputStream("/Applications/eclipse/tdt4100-2018-master2/git/tdt4100-2018/foreksempel/src/io/persons.txt"));
			System.out.println(persons);
		} catch (FileNotFoundException e) {
			System.err.println(e);
		}
	}
}
