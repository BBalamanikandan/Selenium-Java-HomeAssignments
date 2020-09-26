package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Student Name");
	}
	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("Student Id");
	}
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Student Department");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentId();
		s.studentName();
		s.studentDept();
	}
}
