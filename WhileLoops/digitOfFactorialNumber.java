package WhileLoops;

public class digitOfFactorialNumber {

	public static void main(String[] args) {
		int n = 42;
		 if (n < 0) 
	            System.out.println("0");; 
	   
	        // base case 
	        if (n <= 1) 
	            System.out.println("1");; 
	   
	        // else iterate through n and calculate the 
	        // value 
	        double digits = 0; 
	        for (int i=2; i<=n; i++) 
	            digits += Math.log10(i); 
	        System.out.println(digits);
	        System.out.println((int)(Math.floor(digits)) + 1); 
	}

}
