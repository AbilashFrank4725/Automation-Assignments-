package week1and2assignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		//assign int values 
		int FirstNum=0;
		int SecNum=1;
		int Sum=0;
		//print firstnum
		System.out.println(FirstNum);
//initiate loop for first 10 numbers
		for(int i=0;i<=10;i++) {
			Sum=FirstNum+SecNum;
			FirstNum = SecNum;
			SecNum = Sum;
			//print the values
			System.out.println(Sum);
		}
		
		

	}

}
