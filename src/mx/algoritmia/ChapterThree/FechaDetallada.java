package mx.algoritmia.CapituloTres;
import mx.algoritmia.CapituloTres.Fecha;


public class FechaDetallada extends Fecha{

	private static String meses[]= {"ENERO",
									"FEBRERO",
									"MARZO",
									"ABRIL",
									"MAYO",
									"JUNIO",
									"JULIO",
									"AGOSTO",
									"SEPTIEMBRE",
									"OCTUBRE",
									"NOVIEMBRE",
									"DICIEMBRE"};
	
	public FechaDetallada() {
	
		super();

	}
	
	public FechaDetallada(String s) {
		
		super(s);
		
	}
	
	public FechaDetallada(int dia, int mes, int anio) {
		
		super(dia,mes,anio);
		
	}
	
	public String toString() {
		
		return getDia() + " de " + meses[getMes()-1]+" de "+getAnio();
	}

}
