package com.edubridge.elite.main;

import com.edubridge.elite.model.Student;
import com.edubridge.elite.service.StudentSrvices;
 
public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentSrvices service=new StudentSrvices();
		Student[] students = service.getAllStudents();
		
		
		for(Student student : students) {
			System.out.println(student);
		}

	}

}
