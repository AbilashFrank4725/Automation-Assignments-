package week4Day1AssignmentOrg.student;

import week4Day1AssignmentOrg.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Abilash Franklin");
	}
	public void studentDept() {
		System.out.println("Physics");
	}
	public void studentId() {
		System.out.println("18UPH023");
	}
	public static void main(String[] args) {
		Student StudentDetails = new Student();
		StudentDetails.collegeName();
		StudentDetails.collegeCode();
		StudentDetails.collegeRank();
		StudentDetails.deptName();
		StudentDetails.studentName();
		StudentDetails.studentDept();
		StudentDetails.studentId();
	}
}





