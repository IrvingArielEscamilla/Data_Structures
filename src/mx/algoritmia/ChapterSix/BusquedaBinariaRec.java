package mx.algoritmia.CapituloSeis;

public class BusquedaBinariaRec {
	
	public static int busquedaBinaria(int arr[], int v, int i , int j) {
		
		int k = (i + j)/2;
				//condicion de corte
		
		if( i>j) {
			return -i;
		}
		if(arr[k]==v) {
			return k;
		}else {
			if(arr[k]<v) {
				i=k+1;
			}else {
				j= k-1;
			}
			//invocacion recursiva
			return busquedaBinaria(arr,v,i,j);
		}
	}
	
	public static void mian(String[] args) {
		int arr[] = {2,4,5,8,12,18,23,45};
		int v = 6;
		
		System.out.println(busquedaBinaria(arr,v,0,arr.length-1));
	}
}
