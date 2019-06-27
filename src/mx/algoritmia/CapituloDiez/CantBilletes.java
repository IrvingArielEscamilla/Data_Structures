package mx.algoritmia.CapituloDiez;

public class CantBilletes {
	
	private int cantidad;
	private int denominacion;
	
	public CantBilletes(int c,int d) {
		setCantidad(c);
		setDenominacion(d);
	}

	public String toString() {
		String x = cantidad>1?"billetes":"billete";
		return cantidad+" "+x+" de $"+denominacion;
		
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(int denominacion) {
		this.denominacion = denominacion;
	}
	
	
	
}
