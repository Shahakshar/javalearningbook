package array1;

public class bubbleSort {

	public static void main(String[] args) {
		
		int a[] = {3,-2,-7,5,7,3,4,6,1};
		int n = a.length;
		
		for(int i=0; i<n-1; i++)
		{
			boolean sorted = true;
			for(int j=0; j<n-1-i; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					
					sorted = false;
				}
			}
			if(sorted) break;
		}
		for(int item: a) {
			System.out.print(item +"  ");
		}
	}

}
