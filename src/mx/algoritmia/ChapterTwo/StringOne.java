package ChapterTwo;

public class StringOne {

	public static void main (String[] args) {
		
		String s = "Hello again my friends, this a tEsSTt";
		String sCapital = s.toUpperCase();
		String sLower = s.toLowerCase();
		
		System.out.println("Original: " + s);
		System.out.println("Capital: " + sCapital);
		System.out.println("Lower: " + sLower);
	}
}
