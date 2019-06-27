package mx.algoritmia.CapituloTres;
import java.util.Comparator;

public class OrdenCantCar implements Comparator<String> {
	
	public int compare(String s1, String s2) {
		int x = s1.length() - s2.length();
		return x!= 0? x:s1.compareTo(s2);
	}

}
