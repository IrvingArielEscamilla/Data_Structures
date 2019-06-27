package mx.algoritmia.CapituloDiez;

public class Elemento {

	private String nombre;
	private int peso;
	private int valor;
	private double cantidadACargar;
	
	public Elemento(String nombre, int peso, int valor) {
		this.nombre = nombre;
		this.peso =peso;
		this.valor = valor;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public double getCantidadACargar() {
		return cantidadACargar;
	}

	public void setCantidadACargar(double cantidadACargar) {
		this.cantidadACargar = cantidadACargar;
	}
	
	
}
