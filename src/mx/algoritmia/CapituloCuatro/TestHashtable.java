package mx.algoritmia.CapituloCuatro;
import java.util.*;

public class TestHashtable {
	public static void main(String[] args) {
		
		Persona p1 = new Persona("Irving", 24 , "Mexicano");
		Persona p2 = new Persona("Alfredo", 25 , "Chileno");
		Persona p3 = new Persona("Jovanni", 25 , "Argentino");
		
		Hashtable<String,Persona> tabla = new Hashtable<String,Persona>();
		tabla.put(p1.getNombre(), p1);
		tabla.put(p2.getNombre(), p2);
		tabla.put(p3.getNombre(), p3);
		
		System.out.println(tabla.get("Irving"));
		System.out.println(tabla.get("Alfredo"));
		System.out.println(tabla.get("Jovanni"));
		System.out.println(tabla.get("Ragnar"));
		
		String aux;
		Enumeration<String> keys = tabla.keys();
		
		while(keys.hasMoreElements()) {
			
			aux = keys.nextElement();
			System.out.println(aux + " = " + tabla.get(aux));
		}
		
	}
}
