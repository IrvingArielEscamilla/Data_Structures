package mx.algoritmia.CapituloOnce;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Grafo {
	private int matrix[][];
	private ArrayList<Integer> procesados = new ArrayList<Integer>();
	
	public Grafo(int mat [][]) {
		this.matrix = mat;
	}
	
	public int size() {
		return matrix.length;
	}
	
	public int getDistancia(int a,int b) {
		return matrix[a][b];
	}
	
	public Grafo (int n) {
		matrix = new int [n][n];
		for(int i=0; i<n; i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=Integer.MAX_VALUE;
			}
		}
	}
	
	public Grafo(int n , Arista[] arr) {
		this(n);
		for(Arista a:arr) {
			addArista(a);
		}
	}
	
	public void addArista(Arista a) {
		matrix[a.getN1()][a.getN2()] = a.getDistancia();
		matrix[a.getN2()][a.getN1()] = a.getDistancia();
	}
	
	public ArrayList<Integer>getVecinos(int n){
		ArrayList<Integer>a = new ArrayList<Integer>();
		for(int i=0; i<matrix.length;i++) {
			if(matrix[n][i]!= Integer.MAX_VALUE) {
				if(!procesados.contains(i)) {
					a.add(i);
				}
			}
		}
		return a;
	}
	
	
	public void setProcesado(int n) {
		procesados.add(n);
	}
	
	public boolean isProcesado(int n) {
		return procesados.contains(n);
	}
	
	public void resetProcesados() {
		procesados.clear();
	}
	
	
	public boolean hayCiclo(int nInicio, int nFin) {
		ArrayList<Integer>bkpProcesados = (ArrayList<Integer>)procesados.clone();
		resetProcesados();
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(nInicio);
		
		while(!q.isEmpty()) {
			int n = q.poll();
			if(n==nFin) {
				return true;
			}
			setProcesado(n);
			ArrayList<Integer>vecinos = getVecinos(n);
			for(int x:vecinos) {
				q.add(x);
			}
		}
		return false;
	}
	
	public ArrayList<Arista>getAristas(){
		ArrayList<Arista> arr = new ArrayList<Arista>();
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix.length; j++) {
				
			
			if(matrix[i][j]!=Integer.MAX_VALUE) {
				Arista a= new Arista(i,j,matrix[i][j]);
				
				if(!arr.contains(a)) {
					arr.add(a);
					}
				}
			}
		
		}	
		return arr;
	}
	
}
