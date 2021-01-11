package WhileLoops;

import java.util.Scanner;

public class NumberSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		
		//here is one formula to find how many digit in number.
		int NumberOfDigit = (int)Math.log10(n) + 1;
		
		System.out.println("number of digit : " + NumberOfDigit);
		
		int sum = 0;
		
		while(temp!=0) {
			int LastDigit = temp%10;
			temp /=10;
			
			sum +=LastDigit;
		}
		System.out.println( "individual integar sum is :"+ sum);
	}

}
