package mx.algoritmia.CapituloCuatro;
//Last In First Out
public class Cola {
	
	private ListaEnlazada lista;
			
	public Cola() {
		
		lista = new ListaEnlazada();
	}
	
	public void encolar(int v) {
		
		lista.agregarAlFinal(v);
	}
	
	public int desencolar() {
		
		return lista.eliminarAlInicio().getInfo();
		
	}
	
	public boolean colaVacia() {
		
		return lista.listaVacia();
				
	}
}
