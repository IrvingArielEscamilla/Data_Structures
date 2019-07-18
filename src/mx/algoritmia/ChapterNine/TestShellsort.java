package mx.algoritmia.CapituloNueve;

import mx.algoritmia.CapituloSeis.Performance;

public class TestShellsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Performance p = new Performance();
		int arr[];
		int numElem[] = {100,10};
		
		for(int i=0; i<numElem.length;i++) {
		arr= UArray.generaArray(numElem[i], false);
		p.start();
		Ordenamiento.shellSort(arr);
		Ordenamiento.imprimir(arr);
		p.stop();
		System.out.println(p);
	}
	}

}
