package ChapterTwo;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "String -Hello, my name is algoritmia - ";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(s.length()-1));
		
		for(int i=0; i<s.length() ;i++) {
			char c = s.charAt(i);
			System.out.println(i + " -> " + c);
		}

	}

}
