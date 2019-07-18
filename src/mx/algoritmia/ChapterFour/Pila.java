package mx.algoritmia.CapituloCuatro;
// Last In First Out
public class Pila {

	
	private ListaEnlazada lista;
	
	public Pila() {
		
		lista = new ListaEnlazada();
		
	}
	
	public void apilar(int v) {
		
		lista.agregarAlInicio(v);
		
	}
	
	public int desapilar() {
		
		return lista.eliminarAlInicio().getInfo();
		
	}
	
	public boolean pilaVacia() {
		
		return lista.listaVacia();
	}
	
	
}
