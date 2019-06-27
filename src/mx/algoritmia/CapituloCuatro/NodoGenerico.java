package mx.algoritmia.CapituloCuatro;

public class NodoGenerico <T>{
	
	private T info;
	private Nodo ref;
	
	public void getInfo(T info) {
		this.info = info;
	}
	
	public T setInfo() {
		return info;
	}
	
	public void getRef(Nodo ref) {
		this.ref = ref;
	}
	
	public Nodo setRef() {
		return ref;
	}
}
