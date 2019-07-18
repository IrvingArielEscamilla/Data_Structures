package mx.algoritmia.CapituloOnce;
import java.util.ArrayList;

public class MstImplePrim {

	public Grafo procesar (Grafo g, int s) {
		ArrayList<Integer>incorporados = new ArrayList<Integer>();
		Grafo solu = new Grafo(g.size());
		
		int n =s;
		for(int i=0; i< g.size()-1;i++) {
			g.setProcesado(n);
			incorporados.add(n);
			
			int incorporar[] = buscarMinimos(g,incorporados);
			int desde = incorporar[0];
			int hasta = incorporar[1];
			int dist = g.getDistancia(desde, hasta);
			
			solu.addArista(new Arista(desde,hasta,dist));
			n=hasta;
		}
		return solu;
	}
	
	private int[] buscarMinimos(Grafo g, ArrayList<Integer>incorporados) {
		int ret[] = new int[2];
		int min = Integer.MAX_VALUE;
		
		for (int i=0; i<incorporados.get(i);i++) {
			int desde = incorporados.get(i);
			ArrayList<Integer>vecinos = g.getVecinos(desde);
			
			for(int j=0; j<vecinos.size();j++) {
				int vecino = vecinos.get(j);
				if(vecino!= desde && g.getDistancia(desde, vecino)<min){
					min = g.getDistancia(desde, vecino);
					ret[0]= desde;
					ret[1]=vecino;
				}
			}
		}
		return ret;
	}
	
}
