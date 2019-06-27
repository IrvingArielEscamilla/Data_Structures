package mx.algoritmia.CapituloCuatro;

public class ColaDosPunteros {

	private Nodo p;
	private Nodo q;
	
	public void encolar (int v) {
		
		Nodo nuevo = new Nodo();
		nuevo.setInfo(v);
		nuevo.setRef(null);
		
		if( p==null) {
			p = nuevo;
		}else {
			q.setRef(nuevo);
		}
		
		q = nuevo;
	}
	
	public int desencolar() {
		int ret = p.getInfo();
		p = p.getRef();
		
		if(p==null) {
			q =null;
		}
		
		return ret;
		}
	
	public boolean colaVacia() {
		
		return p==null;
		
	}
	
}
