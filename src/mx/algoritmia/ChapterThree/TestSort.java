package mx.algoritmia.CapituloTres;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("Pablo");
		arr.add("Nora");
		arr.add("Rolando");
		arr.add("Analia");
		arr.add("Aldo");
		arr.add("Octaviano");
		arr.add("Luz");
		
		//orden alfabetico ascendente
		
		Collections.sort(arr, new OrdenAsc());
		mostrar(arr);
		System.out.println("------------------------------------");
		//orden alfabetico descendente
		Collections.sort(arr, new OrdenDesc());
		mostrar(arr);
		System.out.println("------------------------------------");
		//orden 
		Collections.sort(arr, new OrdenCantCar());
		mostrar(arr);
		System.out.println("------------------------------------");
		
	}
	
	public static void mostrar(List<String> lst) {
		
		for(String s:lst) {
			System.out.println(s);
		}
	}

}
