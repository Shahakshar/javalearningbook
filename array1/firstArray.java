package array1;

import java.util.Scanner;

public class firstArray {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of student:");
		int n = sc.nextInt();
		
		int marks[] = new int[n];
		
		System.out.println("enter marks of student : ");
		for(int i=0; i<n; i++) {
			marks[i] = sc.nextInt(); 
		}
		
		int averageMarks = 0;
		for(int i=0; i<n; i++) {
			averageMarks += marks[i];
		}
		averageMarks /= n;
		System.out.println("average marks of student is:"+ averageMarks);
		
	}

}
