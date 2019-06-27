package mx.algoritmia.CapituloTres;
//clase abstracta para desacoplar por criterio de comparacion

public abstract class Criterio<T>{

	public abstract int comparar(T a, T b);
	
}
