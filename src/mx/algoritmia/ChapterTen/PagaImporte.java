package mx.algoritmia.CapituloDiez;

import java.util.ArrayList;

public class PagaImporte {

	private int matriz[][];
	private boolean[][] utiliza;
	private int[] denominaciones;
	private int v;
	
	public PagaImporte(int[] denom, int v) {
		this.denominaciones = denom;
		this.v=v;
		armarMatriz();
		
	}
	
	private void armarMatriz() {
		int filas= denominaciones.length;
		int columnas = v + 1;
		matriz = new int [filas][columnas];
		utiliza = new boolean[filas][columnas];
		
		for(int i=0; i<filas; i++) {
			matriz[i][0]=0;
			utiliza[i][0] =false;
						
		}
		
		for(int j=0; j<columnas;j++) {
			matriz[0][j]=j;
			utiliza[0][j]=true;
			
		}
		
		for(int i=1; i<filas;i++) {
			for(int j=1;j<columnas;j++) {
				int op1 = j/denominaciones[i]+matriz[i-1][j%denominaciones[i]];
				int op2 = matriz[i-1][j];
				matriz[i][j]=Math.min(op1, op2);
				utiliza[i][j]=Math.min(op1, op2)==op1;
			}
			
		}
		}
	
	public ArrayList<CantBilletes>obtenerResultados(){
		ArrayList<CantBilletes>a = new ArrayList<CantBilletes>();
		int i = denominaciones.length-1;
		int j = matriz[0].length-1;
		
		while(i>=0) {
			if(utiliza[i][j]) {
				
				int d = denominaciones[i];
				int c = 1;
				int queda = j-d;
				a.add(new CantBilletes(c,d));
				
				if(queda==0) {
					break;
				}
				j=queda;
			}else {
				i--;
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int denom[] = {1,4,6};
		int valor = 8;
		
		PagaImporte t = new PagaImporte(denom,valor);
		ArrayList<CantBilletes>res = t.obtenerResultados();
		System.out.println(res);
	}
	
}
