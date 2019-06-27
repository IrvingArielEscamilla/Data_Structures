package mx.algoritmia.CapituloTres;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciamos un vector especializado en string 
		
		Vector<String> v = new Vector<String>();
		
		v.add("Merit");
		v.add("Irving");
		v.add("Sandra");
		
		String aux;
		
		for(int i=0; i<v.size();i++) {
			aux=v.get(i);
			System.out.println(aux);
		}
	}

}
