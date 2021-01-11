package vectorandStack;

import java.util.Stack;

public class mainClass {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(12);
		stack.push(24);
		stack.push(34);
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
	for(int i=-1; i<=stack.size(); i++) {
			int po = stack.pop();
			System.out.println(po);
		}
		
	}

}
