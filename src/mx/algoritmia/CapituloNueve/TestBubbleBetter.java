package mx.algoritmia.CapituloNueve;
import mx.algoritmia.CapituloSeis.Performance;

public class TestBubbleBetter {

	public static void main(String[] args) {
	Performance p = new Performance();
	int arr[];
	int numElem[] = {1000};
	
	for(int i=0; i<numElem.length;i++) {
		arr= UArray.generaArray(numElem[i], false);
		p.start();
		Ordenamiento.bubbleSortBetter(arr);
		Ordenamiento.imprimir(arr);
		p.stop();
		System.out.println(p);
		System.out.println(" " + UArray.estaOrdenado(arr));
	}
}
}