package mx.algoritmia.CapituloTres;

public class Rectangulo extends FiguraGeometrica{
	
	private double base;
	private double altura;
	
	public Rectangulo (double b, double h) {
		
		super("Rectangulo "); //constructor del padre
		base =b;
		altura =h;
				
	}
	
	public double area() {
		
		return base * altura;
		
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	 
	public double getBase() {
		return base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	
}
