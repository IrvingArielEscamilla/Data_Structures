package mx.algoritmia.CapituloNueve;

public class Ordenamiento {
	//BUBBLESORT
	public static int[] bubbleSort(int arr[]) {
		
		boolean ordenado =false;
		
		while(!ordenado) {
			ordenado = true;
			for(int i=0; i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					int aux = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = aux;
					ordenado = false;
				}
			}
		}
			
		return arr;
	}
	//BUBBLESORT MEJORADA
	public static int[] bubbleSortBetter(int arr[]) {
		
		boolean ordenado = false;
		for(int i=1; i<arr.length; i++) {
			for(int j =0; j<arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					int aux = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = aux;
				}
			}
		}
		return arr;
	}
	
	//SELECTION SORT
	public static int[] selectionSort(int arr[]) {
		
		boolean ordenado = false;
		for(int i=1; i <arr.length; i++) {
			int aux =arr[i];
			for(int j=i-1;j>=0 && arr[j]>aux;j--) {
				arr[j+1] = arr[j];
				arr[j] = aux;
			}
		}
		return arr;
		
	}
	
	
	//INSERTSORT
	public static int[] insertionSort(int arr[]) {
		boolean ordenado = false;
		
		for(int i=1; i <arr.length;i++) {
			int aux = arr[i];
			int  j = i-1;
			for( j=i-1;j>=0&&arr[j]>aux;j--){
				arr[j+1] = arr[j];
				
			}
			arr[j+1] = aux;
		}
		return arr;
		
	}
	//CLASE INTERCAMBIAR
	public static void intercambiar (int []a, int i, int j) {
		
		int aux = a[i];
		a[i] = a[j];
		a[j] = aux;
		
		
	}
	//QUICKSORT RECURSIVO
	public static void quicksort(int a[]) {
		quicksort(a,0,a.length-1);
	}
	
	private static void quicksort(int a[],int primero, int ultimo) {
		
		int i , j , central;
		int pivote;
		central = (primero + ultimo)/2;
		pivote = a[central];
		i= primero;
		j=ultimo;
		
		do {
			while(a[i]<pivote) i++;
			while(a[j]>pivote) j--;
			if(i<= j) {
				intercambiar(a,i,j);
				i++;
				j--;
			}
		}while(i<=j);
		
		if(primero < j) quicksort(a,primero,j);
		if(i<ultimo) quicksort(a,i,ultimo);
		
		
	}
	
	//SHELL SORT
	public static void shellSort(int a[]) {
		int intervalo, i, j , k;
		int n = a.length;
		intervalo = n/2;
		while(intervalo>0) {
			for(i=intervalo; i<n;i++) {
				j= i-intervalo;
				while(j>=0) {
					k = j + intervalo;
					if(a[j]<=a[k]) {
						j=-1;
					}else {
						intercambiar(a,j,j+1);
						j -= intervalo;
					}
				}
			}
			intervalo =  intervalo/2;
		}
	}
	
	//HACER MONTICULO
	public static void hacerMonticulo(int[] arr, int nodo, int fin) {
		int izq = 2*nodo+1;
		int der = izq+1;
		int may;
		if(izq>fin) return;
		if(der>fin) may =izq;
		else may = arr[izq] > arr[der]?izq:der;
		if(arr[nodo]<arr[may]) {
			int tmp = arr[nodo];
			arr[nodo] = arr[may];
			arr[may]=tmp;
			hacerMonticulo(arr,may,fin);
		}
		
	}
	//HEAPSORT
	public static void heapSort(int[] arr) {
		
		final int N = arr.length;
		for(int nodo = N/2; nodo>=0;nodo--) hacerMonticulo(arr,nodo,N-1);
		for(int nodo = N-1; nodo>=0;nodo--) {
			int tmp = arr[nodo];
			arr[nodo] = tmp;
			hacerMonticulo(arr,0,nodo-1);
		}
		
		
	}
	
	//IMPRIMIR ORDENAMIENTOS
	public static void imprimir(int [] arr) {
		System.out.println("--------------------");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("");
	}
	
	
}
