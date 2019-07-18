package mx.algoritmia.CapituloNueve;

import mx.algoritmia.CapituloSeis.Performance;

public class TestInsertSort {

	public static void main(String[] args) {
	int[] arr;
	int[] numElem = {100};
	
	Performance p = new Performance();
	for(int i=0;i<numElem.length;i++) {
		arr = UArray.generaArray(numElem[i], false);
		p.start();
		Ordenamiento.insertionSort(arr);
		Ordenamiento.imprimir(arr);
		p.stop();
		System.out.println(p);
		System.out.println(" " + UArray.estaOrdenado(arr));
	}
	
}
}