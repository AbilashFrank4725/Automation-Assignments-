package week1.assignments;

public class Car {
	public static void main(String[] args) {
		Car myCar = new Car ();
		myCar.applyBreak();
		myCar.applyGear();
		myCar.switchOnAc();
		myCar.applyAccelarate();
	}
    public void applyBreak() {
    	System.out.println("Break applied");
    }
    public void applyGear() {
    	System.out.println("Gear Applied");
    }
    public void switchOnAc() {
    	System.out.println("AC Switched on!!");
    }
    public void applyAccelarate() {
    	System.out.println("Speed Up");
    }
    
}





