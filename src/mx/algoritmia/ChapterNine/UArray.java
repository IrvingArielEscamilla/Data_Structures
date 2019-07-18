package mx.algoritmia.CapituloNueve;

public class UArray {
	
	

	public static int[] generaArray(int n, boolean random) {
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			if(random==false) {
				arr[i] = (int)(Math.random()*n);
			}else {
				arr[i]=n-1;
			}
		}
		return arr;
	}
	
	public static boolean estaOrdenado(int arr[]) {
		
		for(int i=0; i<arr.length-1;i++) {
			if(arr[i+1]<arr[i]) {
				return false;
			}
		}
		return true;
	}
		
		
}
