package mx.algoritmia.CapituloDos;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Esta es mi cadena";
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(s.length()-1));
		
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			System.out.println(i + " -> " + c);
		}
	}

}
