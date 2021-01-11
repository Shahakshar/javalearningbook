package array1;

import java.util.Arrays;
import java.util.Scanner;

public class squart {

	public static void main(String[] args) {
		
//		int a = 8;
//		double b = (double)a;
//		double ans = Math.sqrt(b);
//		System.out.println((int)ans);
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}

}
