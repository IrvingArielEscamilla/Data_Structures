package mx.algoritmia.CapituloOnce;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MstImpleKruskal {
	
	
	public Grafo procesar (Grafo g, int s) {
		ArrayList<Arista>aristas = g.getAristas();
		Collections.sort(aristas, new ComparaArista());
		Grafo solu = new Grafo(g.size());
		int i=0;
		while(!aristas.isEmpty()&& i<g.size()-1) {
			Arista a = aristas.get(0);
			if(!solu.hayCiclo(a.getN1(), a.getN2())) {
				solu.addArista(a);
				i++;
			}
			aristas.remove(0);
		}
		return solu;
	}
	
	class ComparaArista implements Comparator<Arista>{
		public int compare (Arista a1,Arista a2) {
			return a1.getDistancia()-a2.getDistancia();
		}
	}
	
	
	
}
