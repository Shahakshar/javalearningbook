package leetCode;

public class TinyUrl {

	public static void main(String[] args) {
		
		String shortUrl = "https://akshar.abc/name/cool";
		
		String sU = shortUrl.substring(0, shortUrl.length()/2);
		System.out.println(sU);
		System.out.println(shortUrl.length());

	}

}
