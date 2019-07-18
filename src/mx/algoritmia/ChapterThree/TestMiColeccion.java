package mx.algoritmia.CapituloTres;
import java.util.*;
//ALGO ESTA MAL AQUI, Y ME LO VOY A COMER ...JAJAJAJ
public class TestMiColeccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner scanner = new Scanner(System.in);		
		//inicializamos la coleccion con 5 elementos
		MiColeccion mc= new MiColeccion(5);
		//leer el primer nombre
		System.out.println("Ingrese el Nombre: ");
		String nom = scanner.next();
		
		while(!nom.equals("FIN")) {
			//insertamos en la posicion 0
			mc.insertar(nom, 0);
			//leemo el siguiente nombre
			nom= scanner.next();
			
		}
		
		String aux;
		//recorremos la coleccion y tomamos cada uno de sus elementos
		
		for(int i=0; i<mc.cantidad(); i++) {
			//el metodo obtener retorna un Object
			//entonces tenemos que castear a String 
			aux = (String) mc.obtener(i);
			System.out.println(aux + " - " + aux.length()+ " caracteres ");
		}
		
	}

}
