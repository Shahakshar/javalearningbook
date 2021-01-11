package String;

public class simpleTerminology {

	public static void main(String[] args) {
		
		System.out.println(Integer.MIN_VALUE + "<==>" + Integer.MAX_VALUE);
		// this is Integer minimum and maximum value it is [-2147483647, 2147483647].
		String name1 = new String("Akshar");
		String name2 = "Akshar";
		
		System.out.println("it is equal operator to say string is equal or not :" + name1.equals(name2));
		System.out.println(name1.equalsIgnoreCase("Zeel"));
		System.out.println("it's those index that we have to choose for specific character :" + name2.charAt(2));
		System.out.println("it's only have starting Index and after all word in sequence :" + name1.substring(2));
		
		System.out.println("it is some sequence b/w two Indeies :" + name1.substring(2, 6));
//here one interesting thing endIndex have a IndexLength = s.length().
		
		System.out.println("it is total length of String :" + name1.length());
		System.out.println("in contains operator if char present in string or not :" + name1.contains("har"));
		System.out.println(name2.isEmpty());
		
		System.out.println("in this operation some portion join with object :" + name1.concat(" shah"));
		System.out.println(name1.replace("A", "a"));
		
		String names = "mayur avdhi zeel poojan milli parth";
		String snames[] = names.split(" ");
		for(String s: snames) {
			System.out.println(s);
		}
		
		System.out.println(names.indexOf('z'));
		//if we choose those character that not given in string then it return -1.
		
		System.out.println("compare two thing : " + name1.compareTo(name2));
	}

}
