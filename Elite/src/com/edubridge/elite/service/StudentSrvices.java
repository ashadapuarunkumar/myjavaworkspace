package com.edubridge.elite.service;

import com.edubridge.elite.model.Student;

public class StudentSrvices {
	Student[] students;
	public StudentSrvices() {
		students=new Student[] {
		new Student(100,"amar","ajh@com",9988776654l),
		new Student(100,"akram","ajh@com",9988776653l),		
		new Student(100,"alan","ajh@com",9988776652l),		
		new Student(100,"Ajay","ajh@com",9988776652l),		
				
		};
			
	}
	
	public Student[] getAllStudents() {
		return students;
	}
	
	
}
