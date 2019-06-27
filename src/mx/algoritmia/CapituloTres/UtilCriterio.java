package mx.algoritmia.CapituloTres;

public class UtilCriterio {
	
	public static void ordenar(Object arr[], Criterio cr) {
		
		boolean ordenado = false;
		while(!ordenado) {
			ordenado = true;
			for(int i=0, j = arr.length-1; i<=j;i++,j--) {
				//la desicion de quien precede a quien se toma por Criterio
				if(cr.comparar(arr[i+1], arr[i])<0) {
					Object aux = arr[i];
					arr[i]=arr[i+1];
					arr[i+1] = aux;
					ordenado = false;
				}
			}
		}
	}
	
	public static void imprimirArray(Object arr[]) {
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
