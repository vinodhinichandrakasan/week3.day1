package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("student Name");
	}
	
	public void studentDept()
	{
		
		System.out.println("student  Dept");
	}
	
	public void studentId()
	 {
		
		System.out.println("student Id");
	}

	public static void main(String[] args) {
		
		//object creation
		
		Student std=new Student();
		// extending grand parents method
			std.collegeName();
			std.collegeCode();
			std.collegeRank();
		//extending parents method-dept
			std.deptName();
			
		//calling  methods in the class
			std.studentDept();
			std.studentId();
			std.studentName();

	}

}
