package mx.algoritmia.CapituloTres;

public class TestMuestraConjunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] arr = {new Fecha (2,11,190),
						new FechaDetallada (23,12,1948),
						new String("Esto es una cadena"),
						new Integer(34) };
		
		MuestraConjunto.mostrar(arr);
		
	}

}
  