package week4Day1AssignmentOverload;

public class Employee {
	public void getEmployeeInfo(int employeeId) {
		System.out.println(employeeId);
	}
	public void getEmployeeInfo(int employeeId,String name) {
		System.out.println(employeeId +" - "+ name);
	}
	public void getEmployeeInfo(int employeeId,String name,String email) {
		System.out.println(employeeId +" - "+ name +" - "+ email);
	}
	public void getEmployeeInfo(int employeeId,String name,String email,long telephone) {
		System.out.println(employeeId +" - "+ name +" - "+ email+" - "+telephone);
	}
	
public static void main(String[] args) {
	Employee EmployeeInfo =  new Employee();
	EmployeeInfo.getEmployeeInfo(21275002);
	EmployeeInfo.getEmployeeInfo(21275002, "Abilash Franklin");
	EmployeeInfo.getEmployeeInfo(21275002, "Abilash Franklin", "godzilla@gmail.com");
	EmployeeInfo.getEmployeeInfo(21275002, "Abilash Franklin", "godzilla@gmail.com", 987456321012L);
}

}
