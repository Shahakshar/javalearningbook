package Map;
import java.util.*;
import java.util.Map.Entry;
public class MainClass {

	public static void main(String[] args) {
		
		Map<String, Integer> numbers = new HashMap<String, Integer>();
		
		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		
		numbers.putIfAbsent("one", 10);
		
		System.out.println(numbers);
		Set<Entry<String, Integer>> entries = numbers.entrySet();
		
		for(Entry<String, Integer> entry: entries) {
			entry.setValue(entry.getValue() * 100);
		}
		System.out.println(numbers);
	}

}
