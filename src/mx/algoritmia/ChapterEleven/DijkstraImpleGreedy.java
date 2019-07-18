package mx.algoritmia.CapituloOnce;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

public class DijkstraImpleGreedy implements Dijkstra{

	public Hashtable<Integer, Integer>procesar (Grafo g, int s){
		
		
		Hashtable<Integer, Integer>distMin = new Hashtable<Integer, Integer>();
		inicializar(distMin, g.size(),Integer.MAX_VALUE);
		
		Hashtable<Integer,Integer>distAcum = new Hashtable<Integer,Integer>();
		inicializar(distAcum,g.size(), 0);
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		
		while(!q.isEmpty()) {
			int n = q.poll();
			g.setProcesado(n);
			int acum = distAcum.get(n);
			
			ArrayList<Integer> vecinos = g.getVecinos(n);
			for(int i=0; i<vecinos.size();i++) {
				int t = vecinos.get(i);
				int dist = g.getDistancia(n, t) + acum;
				int min = distMin.get(t);
				if(dist<min) {
					distMin.put(t,dist);
					distAcum.put(t,dist);
				}
				if(!q.contains(t)) {
					q.add(t);
				}
			}
		}
		return distMin;
	}
	
	private void inicializar(Hashtable<Integer,Integer> tdist,int size, int val) {
		for(int i=0; i<size;i++) {
			tdist.put(i, val);
		}
	}
}
