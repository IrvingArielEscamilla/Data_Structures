package mx.algoritmia.CapituloNueve;
import mx.algoritmia.CapituloSeis.Performance;

public class TestBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Performance p = new Performance();
		int arr[] ;
		
		int cantElm[] = {1000};/*,1000,10000,1000000};*/
		
		for(int i=0; i<cantElm.length; i++) {
			arr = UArray.generaArray(cantElm[i], false);
			p.start();
			Ordenamiento.bubbleSort(arr);
			Ordenamiento.imprimir(arr);
			p.stop();				
			System.out.println(p);
			System.out.println(" " + UArray.estaOrdenado(arr));
		}
		
		/*int[] numeros = {5,6,1,0,3};
		int[] ordenadoBubble = Ordenamiento.bubbleSort(numeros);
		Ordenamiento.imprimir(ordenadoBubble);*/
	}
	
	
	}
