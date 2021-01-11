package deque;

public class MainClass {

	public static void main(String[] args) {
		
		MyDeque<Integer> md = new MyDeque<>();
		
		md.addTohead(23);
		md.addTohead(34);
		md.addTohead(44);
	
		System.out.println(md.removeLast());
		System.out.println(md.removeLast());
	}

}
