package GFG;

public class GPterm {

	public static void main(String[] args) {
		int A = 3;
		int B = 2;
		int N = 2;
	        
		if(N<=0){
			System.out.println("0");
		}
	        double C = B/A;
	        System.out.print((int)(A * Math.pow(C,N-1)));
	        

	}

}
