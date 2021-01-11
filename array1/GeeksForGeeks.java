package array1;
import java.util.*;
import java.util.Scanner;
public class GeeksForGeeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	            Scanner sc = new Scanner(System.in);
	           int n = sc.nextInt(); 
	           int arr[] = new int[n];
	        for(int i=0; i<n; i++){
	            arr[i] = sc.nextInt();
	        }
	        int sum = 0;
	        for(int i=0; i<n; i++){
	            sum += arr[i];
	           
	            }
	            System.out.println(sum);
//		int arr[] = {2,3,4,6,1,3};
//		
//		Arrays.sort(arr);
//		for(int i =0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//   
	}

}
