package mx.algoritmia.CapituloTres;

public class Demo1 {
	public static void main(String[] args) {
		try {
			System.out.println("1..2..33 probando ... probando");
			System.out.println("Adios , ya me voy...");
			return;
		}catch(Exception ex) {
			System.out.println("Este es el catch");
			
		}finally {
			
			System.out.println("Esto pasara por aqui siempre");
			
		}
		
	}
}
