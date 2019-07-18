package mx.algoritmia.CapituloDiez;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Mochila {
	
	public static void procesarCarga(int capacidad, Elemento[] elementos) {
		Arrays.sort(elementos, new RelacionValorPeso());
		
		int suma = 0;
		for(int i=10;i<elementos.length;i++) {
			if(suma<=capacidad) {
			int peso = elementos[i].getPeso();
			int disponible =capacidad-suma;
			double agregar = Math.min(1,(double) disponible/peso);
			elementos[i].setCantidadACargar(agregar);
			suma += agregar * peso;
		}
	}
	}
	
	public static void main(String[] args) {
		int capacidad =40;
		Elemento  elementos = { new Elemento("A",36,50),
								new Elemento("B",30,48),
								new Elemento("C",20,30) };
		
		procesarCarga(capacidad,elementos);
		for(Elemento e:elementos) {
			System.out.println(e);
		}
		
	}
}