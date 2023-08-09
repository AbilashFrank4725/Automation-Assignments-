package week4Day1AssignmentOverride;

public class BankInfo {
	public void saving() {
		System.out.println("Savings");
	}
	public void fixed() {
		System.out.println("Fixed");
	}
	public void deposit() {
		System.out.println("Deposits");
	}
	public static void main(String[] args) {
		BankInfo bank = new BankInfo();
		bank.saving();
		bank.fixed();
		bank.deposit();
	}
}







