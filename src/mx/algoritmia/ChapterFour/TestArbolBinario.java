package mx.algoritmia.CapituloCuatro;
import java.util.Iterator;
import java.util.TreeSet;


public class TestArbolBinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet <Integer> t = new TreeSet<Integer>();
		t.add(5);
		t.add(3);
		t.add(9);
		t.add(2);
		
		System.out.println(t.contains(5));
		System.out.println(t.contains(12));
		System.out.println();
		
		for(Iterator<Integer>it = t.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
	}

}
