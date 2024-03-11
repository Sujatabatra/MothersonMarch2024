package com.sujata.training;

import com.sujata.demo.Student;

public class ClientMain {

	public static void main(String[] args) {
		Student student=new Student();
		student.input(101, "AAA");
		student.displayData();
		
		System.out.println("==============");
		
		Marks marks=new Marks();
		marks.input(111, "ABCD", 23, 78, 89);
		marks.displayData();
	}

}
