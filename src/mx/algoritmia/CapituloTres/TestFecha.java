package mx.algoritmia.CapituloTres;
import java.util.*;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f = new Fecha(0, 0, 0);
		
		f.setDia(2);
		f.setMes(10);
		f.setAnio(1970);
		
		System.out.println("Dia = " +f.getDia());
		System.out.println("Mes = " +f.getMes());
		System.out.println("Anio = " +f.getAnio());
		
		System.out.println(f);
		
	}

}
