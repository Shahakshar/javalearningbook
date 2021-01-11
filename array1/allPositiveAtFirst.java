package array1;

public class allPositiveAtFirst {

	public static void main(String[] args) {
		
		int a[] = {-2, -3, -4, -5, 5, 4, 3, 2};
		int n = 8;

		interChange(a,n);
		
		StringBuffer str = new StringBuffer();
		for(int i=0; i<n; i++) {
			str.append(a[i] + " ");
		}
		System.out.println(str);
	}
	
	public static void interChange(int a[], int n) {
		int temp[] = new int[n]; 
		  
        int j = 0;
        
//        if (j == n || j == 0) 
//            return; 
        
        for (int i = 0; i < n; i++) 
            if (a[i] >= 0) 
                temp[j++] = a[i]; 
  
        if (j == n || j == 0) 
            return; 
  
        for (int i = 0; i < n; i++) 
            if (a[i] < 0) 
                temp[j++] = a[i]; 
  
        for (int i = 0; i < n; i++) 
            a[i] = temp[i];
	}

}
