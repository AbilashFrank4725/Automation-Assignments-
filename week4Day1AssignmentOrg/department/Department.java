package week4Day1AssignmentOrg.department;

import week4Day1AssignmentOrg.college.College;

public class Department extends College{
	public void deptName() {
		System.out.println("Physics");
	}
	public static void main(String[] args) {
		Department dept = new Department();
		dept.collegeName();
		dept.collegeCode();
		dept.collegeRank();
		dept.deptName();
	}

}
