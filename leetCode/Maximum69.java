package leetCode;

public class Maximum69 {

	public static void main(String[] args) {
		
		int num = 969;
		int di = (int)Math.log10(num);
		
		
		for(int i=di; i>=0; i--) {
			int n = num/(int)Math.pow(10, i);
			n = n % 10;
			
			if(n == 6) {
				System.out.println(3*(int)Math.pow(10, i) + num);
			}else {
				System.out.println(num);
			}
		}
	}
}
