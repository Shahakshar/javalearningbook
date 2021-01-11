package array1;

import java.util.Arrays;

public class ReverseTheArray {
	public static void print(int arr[]) {
		int l = 0;
		int h = arr.length - 1;
		
		while(l < h) {
			int temp = arr[l];
			arr[l] = arr[h];
			arr[h] = temp;
			l++;
			h--;
		}
	}
	
	public static int minElement(int arr[]) {
		
		Arrays.sort(arr);
		
		if(arr.length == 0 || arr == null) {
			throw new IllegalArgumentException();
		}
		return arr[0];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4, 5};
		print(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int m = minElement(arr);
		System.out.println(m);
	}

}
