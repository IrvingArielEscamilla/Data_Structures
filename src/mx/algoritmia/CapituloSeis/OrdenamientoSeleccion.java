package mx.algoritmia.CapituloSeis;

public class OrdenamientoSeleccion {

	
	public static void ordenar(int arr[], int dd) {
	
		if(dd<arr.length) {
		int posMin = buscarMinimo(arr,dd);
		
		int aux = arr[dd];
		arr[dd] = arr[posMin];
		arr[posMin] = aux;
		
		ordenar(arr, dd+1);
	}
	}
	
	private static int buscarMinimo(int[] arr, int dd) {
		int posMin = dd;
		int min = arr[dd];
		
		for (int i = dd+1; i<arr.length; i++) {
			if(arr[i] < min) {
				min =  arr[i];
				posMin = i;
			}
		}
		return posMin;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,7,1,2,9,8,4,6,5,10};
		
		ordenar(arr,0);
		for (int i:arr) {
			System.out.println(i);
		}
	}

}
