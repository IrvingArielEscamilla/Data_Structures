package mx.algoritmia.CapituloDiez;

public class RelacionValorPeso {

	public int compare(Elemento e1, Elemento e2) {
		double d1 =(double)e1.getValor()/e1.getPeso();
		double d2 =(double)e2.getValor()/e2.getPeso();
		
		return -1*(d1<d2?-1:d1>d2?1:0);
	}
}
