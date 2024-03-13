package com.sujata.chario;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CharWriteFileDemoClass {

	public static void main(String[] args) {

		try (FileWriter fileWriter = new FileWriter("CharIODemo");) {

			String arr ="Sujata Batra\n Delhi";

			fileWriter.write(arr);
			
			System.out.println("File Created");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
