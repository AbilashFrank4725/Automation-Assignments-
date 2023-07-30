package week1and2assignments;

import java.util.Arrays;

public class SortingNumber {
	public static void main(String[] args) {
		//assign array of integers
		int[] num= {12,4,9,69,87,97};
		//sorting the array
		Arrays.sort(num);
		//Loop it for ascending order
		for(int i=num.length-1;i>0;i--) {
				System.out.println(num[i]);
		}
		//loop for descending order
		System.out.println();
		for(int j=0;j<num.length;j++) {
			    System.out.println(num[j]);
		}
	}
}
	


