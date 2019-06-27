package mx.algoritmia.CapituloDos;

public class Cadenas4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Un buen libro de Algoritmos";
		
		boolean b1 = s.startsWith("Un buen");
		boolean b2 = s.startsWith("A");
		boolean b3 = s.endsWith("Algoritmos");
		boolean b4 = s.endsWith("Chau");
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
	}

}
