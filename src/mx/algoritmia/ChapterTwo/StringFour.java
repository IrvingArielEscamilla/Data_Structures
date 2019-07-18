package ChapterTwo;

public class StringFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "String -Hello, my name is algoritmia - ";
		
		boolean b1 = s.startsWith("String -Hello");
		boolean b2 = s.startsWith("S");
		boolean b3 = s.endsWith("algoritmia");
		boolean b4 = s.endsWith("chau");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);

		
	}

}
