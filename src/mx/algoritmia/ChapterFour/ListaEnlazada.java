package mx.algoritmia.CapituloCuatro;

public class ListaEnlazada {

	private Nodo p = null;
	
	public boolean listaVacia() {
		
		return p == null;
	}
	
	public Nodo buscar(int v) {
		
		Nodo aux = p;
		//mientras no encuentre y no llegue al final
		while(aux!=null && aux.getInfo()!=v) {
			aux = aux.getRef();
		}
		return aux;
		
	}
	
	public void agregarAlFinal(int v) {
		
		//creamos nodo y asignamos atributos
		Nodo nuevo = new Nodo();
		nuevo.setInfo(v);
		nuevo.setRef(null);
		//si la lista esta
		
		if(p==null) {
			
			p=nuevo;//el nuevo es primero y ultimo
			return;
		}
		//la lista no esta vavia , entonces  recorro
		
		Nodo aux = p;
		
		while(aux.getRef()!=null) {
			//hago que aux apunte al siguiente
			
			aux = aux.getRef();
			
		}
		
		aux.setRef(nuevo);
	}
	
	public void agregarAlInicio(int a) {
		
		//intanciamoe el nuevo nodo con atributos
		Nodo nuevo = new Nodo();
		nuevo.setInfo(a);
		//p(el primero hasta ahora) sera su siguiente
		nuevo.setRef(p);
		//p debe apuntar al primer nodo de la lista
		p = nuevo;
		
	}
	
	public Nodo eliminar(int v) {
		
		Nodo ant = null;
		Nodo aux = p;
		
		while(aux!=null && aux.getInfo()!=v) {
			
			ant = aux;
			aux = aux.getRef();
		}
		
		if(aux!=null) {
			
			ant.setRef(aux.getRef());
		}
		
		return aux;
	}
	
	public Nodo eliminarAlInicio() {
		
		Nodo aux = p;
		p = aux.getRef();
		return aux;
	}
	
}
