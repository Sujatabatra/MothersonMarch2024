package com.sujata.objectio;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWriteFileDemoClass {

	public static void main(String[] args) {
		
		try(FileOutputStream fileOutputStream=new FileOutputStream("PersonData");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
				){

			Person person=new Person(111, "ABC");
			objectOutputStream.writeObject(person);
			System.out.println("File Created");
			
	}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
