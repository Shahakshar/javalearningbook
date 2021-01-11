package MyLinkedList;

public class mainLinkedList {
	public static void main(String[] arg) {
		MyLinkedList<String> myll = new MyLinkedList<>();
		
		for(int i=0; i<10; i++) {
			myll.add("added");
		}
		
		myll.print();
	}
}