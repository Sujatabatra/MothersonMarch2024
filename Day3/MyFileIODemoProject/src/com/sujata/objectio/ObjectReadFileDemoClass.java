package com.sujata.objectio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectReadFileDemoClass {

	public static void main(String[] args) {

		try (FileInputStream fileInputStream = new FileInputStream("PersonData");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {

			Person person = (Person) objectInputStream.readObject();
			System.out.println(person);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
