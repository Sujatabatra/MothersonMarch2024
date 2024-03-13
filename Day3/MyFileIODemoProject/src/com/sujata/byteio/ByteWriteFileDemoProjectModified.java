package com.sujata.byteio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWriteFileDemoProjectModified {

	public static void main(String[] args) {

//		File file=new File("ByteIODemo");

		try (FileOutputStream fileOutputStream = new FileOutputStream("ByteIODemo");) {

			byte[] arr = { 'S', 'U', 'J', 'A', 'T', 'A', '\n', 'B', 'A', 'T', 'R', 'A' };

			fileOutputStream.write(arr);
			System.out.println("File Created");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
