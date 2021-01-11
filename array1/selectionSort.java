package array1;

public class selectionSort {

	public static void main(String[] args) {
		
		int a[] = {5,6,3,1,-5,-8,3};
		int n = a.length;
		      
		for(int i=0; i<n-1; i++) {
			
			int minInd = i;      
			
			 /*this mid Index can store value of i because, 
            it will comparing value of array a.*/
			
			for(int j=i; j<n; j++) {
				if(a[minInd]>a[j])
				{
					minInd = j;
				}
			}
			int temp = a[i];
			a[i] = a[minInd];
			a[minInd] = temp;
		}
		for(int e: a) {
			System.out.print(e +" ");
		}
	}

}
