package mx.algoritmia.CapituloOnce;
import java.util.Scanner;
public class Test {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
			int i = Integer.MAX_VALUE;
			int[][] mAdy = {{i,6,i,6,i,i,i},
					{6,i,2,i,4,i,i},
					{i,2,i,4,6,4,i},
					{6,i,4,i,i,2,6},
					{i,4,6,i,i,6,i},
					{i,i,4,2,6,i,4},
					{i,i,i,6,i,4,i}};
			Grafo g = new Grafo(mAdy);
			
			System.out.println("Ingrese el nodo inicial:");
			int s = scanner.nextInt();
			
			System.out.println("Ingrese la implementacion: ");
			String sClassImple = scanner.next();
			
			Mst mst = (Mst)Class.forName(sClassImple).newInstance();
			Grafo solu = mst.procesar(g, 0);
			for(Arista a:solu.getAristas()) {
				System.out.println(a);
			}
		
	}
}
