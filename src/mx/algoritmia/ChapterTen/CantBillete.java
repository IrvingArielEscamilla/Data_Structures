package mx.algoritmia.CapituloDiez;

public class CantBillete {
 
	private int denom;
	private int cant;
	
	public CantBillete(int d, int c) {
		
		denom = d;
		cant = c;
	}

	public int getDenom() {
		return denom;
	}

	public void setDenom(int denom) {
		this.denom = denom;
	}

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}
	
	
	
}
