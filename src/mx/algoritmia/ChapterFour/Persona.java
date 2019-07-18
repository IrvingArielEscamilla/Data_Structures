package mx.algoritmia.CapituloCuatro;

public class Persona {
	private String nombre;
	private int edad;
	private String nacionalidad;
	
	public Persona(String nombre, int edad, String nacionalidad) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		
	}
	
	public String toString () {
		
		return nombre + ", " + edad + " anios, " + nacionalidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
}
