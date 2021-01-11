package array1;

public class simpleLogic {
	public static void main(String[] args) {
		
		int j = 1;
		
		System.out.println("ans of j is " + (j = 1 + j));//++j
		System.out.println("ans of j is " + j++);
		System.out.println("ans of j is " + --j);
		System.out.println("ans of j is " + j--);
		
		System.out.println(j);
		// assignment operator priority is higher then arithmetic operator. 
	}
}
