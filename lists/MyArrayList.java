package lists;

import java.util.LinkedList;
import java.util.List;


public class MyArrayList {

	public static void main(String[] args) {
		
		List<String> fruits = new LinkedList<>();
//		List<String> vagetable = new ArrayList();
		
		fruits.add("Apple");
		fruits.add("orange");
		fruits.add("hii");
//		fruits.add(23);
//		vagetable.add("poteto");
//		vagetable.add("tomato");
//		vagetable.add("cerrote");
//		
//		fruits.addAll(vagetable);
		fruits.set(1, "bannana");
		
		System.out.println(fruits);

	}

}
