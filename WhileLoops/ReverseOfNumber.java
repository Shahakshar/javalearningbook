package WhileLoops;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int ReversedNumber = 0;
		
		while(temp!=0) {
			int LastDigit = temp % 10;
			ReversedNumber = ReversedNumber * 10 + LastDigit;
			
			temp/=10;
		}
		System.out.println("reverse number is:"+ ReversedNumber);
		
		if(n==ReversedNumber)
			System.out.println("so number is palindrome !!");
		else
			System.out.println("not palindrome!!!");
	}

}
