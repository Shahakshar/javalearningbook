package String;

public class anagram2 {

	public static void main(String[] args) {
		
		String a = "aab3211";
		String b = "aba11234";
		
		boolean isAnagram = true;
		
		int al[] = new int[256];
		
		for(char c: a.toCharArray()) {
			int index = (int) c;
			al[index]++;
		}
		
		for(char c: b.toCharArray()) {
			int index = (int) c;
			al[index]--;
		}
			for(int i=0; i<256; i++) {
				if(al[i] != 0) {
					isAnagram = false;
				}
			}
			if(isAnagram) {
				System.out.println("is anagram!!");
			}
			else {
				System.out.println("is not anagra!!");
			}
	

	}

}
