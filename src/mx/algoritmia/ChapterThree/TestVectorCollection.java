package mx.algoritmia.CapituloTres;
import java.util.Collection;

public class TestVectorCollection {
	
	public static void main(String[] args) {
		
		Collection<String> coll = UNombres.obtenerLista();
		
		for(String nom: coll) {
			
			System.out.println(nom);
		}
	}

}
