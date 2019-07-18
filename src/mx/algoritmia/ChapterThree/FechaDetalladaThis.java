package mx.algoritmia.CapituloTres;

public class FechaDetalladaThis extends Fecha{

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
	
	public FechaDetalladaThis (int dia, int mes, int anio) {
		
		super(dia,mes,anio);
		
	}
	
	public FechaDetalladaThis() {
		
		this(0,0,0);
		
	}
	
	public FechaDetalladaThis(String s) {
		
		super(s);
		
	}
	
	public String toString() {
		
		return getDia() + " de " + meses[getMes()-1]+" de "+getAnio();
	}
	
}
