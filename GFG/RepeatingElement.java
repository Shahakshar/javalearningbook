package GFG;

public class RepeatingElement {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4};
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			int index = arr[i] % n;
			arr[index] = arr[index] + n;
		}
//		System.out.println(arr[0]);
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
