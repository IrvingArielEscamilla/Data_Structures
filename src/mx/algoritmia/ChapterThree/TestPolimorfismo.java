package mx.algoritmia.CapituloTres;
import mx.algoritmia.CapituloTres.Fecha;
import mx.algoritmia.CapituloTres.FechaDetallada;


public class TestPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fecha fec = new FechaDetallada (25,02,2009);
		
		Object obj = new FechaDetallada (3,12,2008);
		
		System.out.println("fec = " +fec);
		System.out.println("obj = " + obj);
		
	}

}
