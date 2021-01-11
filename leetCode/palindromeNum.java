package leetCode;

public class palindromeNum {
	public boolean isPalindrome(int x) {
		
		         if(x < 0) return false;
		         int reversed = 0, remainder, original = x;
		   while(x != 0) {
		        remainder = x % 10; 
		        reversed = reversed * 10 + remainder; 
		        x /= 10;  
		    }
		    
		    return original == reversed;
		       
 }
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
