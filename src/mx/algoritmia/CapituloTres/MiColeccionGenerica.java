package mx.algoritmia.CapituloTres;

public class MiColeccionGenerica <T> {
	
	private Object datos[] = null;
	private int len = 0;
	
	//contructor en donde se especifica la capacidad inicial
	
	public MiColeccionGenerica(int capacidadInicial) {
		
		datos = new Object[capacidadInicial];
		
	}
	//retorna el i-esimo elemento de la coleccion
	
	public T obtener(int i) {
		
		return (T)datos[i];
		
	}
	
	//indica cuantos elementos tiene la coleccion
	
	public int cantidad() {
		
		return len;
		
	}
	
	//metodo insertar
	
	public void insertar (T elm , int i) {
		
		if(len == datos.length) {
			
			Object aux[] = datos;
			datos = new Object[datos.length * 2];
			
			for (int j=0; j<len; j++) {
				
				datos[j] = aux[j];
			}
			aux = null;
		}
		
		for( int j=len-1; j>=i; j--) {
			
			datos[j+1] = datos[j];
		}
		
		datos[i] =elm;
		len++;
	}
	
	//metodo buscar
	
	public int buscar(T elm) {
		
		int i = 0 ;
		//mientras no pasemo del tope
		
		for(; i<len && !datos[i].equals(elm); i++) ;
		
		//si no pasamos entonces encontramos; sino, no encontramos??
		
		return i<len ? i: -1;
		
	}
	
	//metodo agregar
	
	public void agregar(T elm) {
		
		insertar(elm,len);
	}
	
	//elimina un elemento desplazando los demas hacia arriba
	
	public T eliminar(int i) {
		
		Object aux = datos[i];
		
		for(int j=i; j<len-1;j++) {
			
			datos[j] = datos[j+1];
		}
		
		 len--;
		 
		 return (T)aux;
		 
	}

}
