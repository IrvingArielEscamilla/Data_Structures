package mx.algoritmia.CapituloNueve;
import mx.algoritmia.CapituloSeis.Performance;

public class TestSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[];
		int numElem[] = {100};
		
		Performance p = new Performance();
		
		for(int i=0; i<numElem.length; i++) {
			arr = UArray.generaArray(numElem[i], false);
			p.start();
			Ordenamiento.selectionSort(arr);
			Ordenamiento.imprimir(arr);
			p.stop();
			System.out.println(p);
			System.out.println(" " + UArray.estaOrdenado(arr));
		}
	}

}
