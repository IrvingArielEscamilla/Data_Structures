package mx.algoritmia.CapituloOnce;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class VerificaCiclos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Grafo g = ingresaGrafo(scanner);
		Arista a = ingresaAristaAVerificar(scanner);
		
		if(hayCiclo(g,a)) {
			System.out.println("La arista forma un ciclo");
		}else {
			System.out.println("La arista no forma un ciclo");
		}
	}
	
	private static boolean hayCiclo(Grafo g,Arista a) {
		ArrayList<Integer>procesados = new ArrayList<Integer>();
		Queue<Integer>q = new LinkedList<Integer>();
		
		int nInicio = a.getN1();
		int nFin = a.getN2();
		
		q.add(nInicio);
		
		while(!q.isEmpty()) {
			int n = q.poll();
			if(n==nFin) {
				return true;
			}
			procesados.add(n);
			ArrayList<Integer> vecinos = g.getVecinos(n);
			
			for(int v:vecinos) {
				if(!procesados.contains(v)) {
					q.add(v);
				}
			}
		}
		return false;
	}
	
	private static Grafo ingresaGrafo(Scanner scanner) {
		System.out.println("---Ingreso del grafo---");
		System.out.println("Cantidad de vertices: ");
		int n  = scanner.nextInt();
		Grafo g =  new Grafo(n);
		System.out.println("Cantidad de aristas: ");
		int a = scanner.nextInt();
		System.out.println(" Ingrese" +a+ " aristas-");
		for(int i=0; i<a;i++) {
			g.addArista(ingresaArista(scanner));
		}
		return g;
	}
	
	
	private static Arista ingresaAristaAVerificar(Scanner scanner) {
		System.out.println("--Ingrese la arista a verificar--");
		return ingresaArista(scanner);
	}
	
	private static Arista ingresaArista(Scanner scanner) {
		System.out.println("Extremo inicial:");
		int n1 = scanner.nextInt();
		
		System.out.println("Extremo final: ");
		int n2 = scanner.nextInt();
		
		System.out.println("DIstancia");
		int d = scanner.nextInt();
		
		Arista a = new Arista(n1,n2,d);
		System.out.println("Arista ingresada: " +a);
		
		return a;
	}
}
