package mx.algoritmia.CapituloTres;
import java.util.*;

public class TestFecha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Ingrese Fecha 1 (dia, mes ,anio): ");
			int dia = scanner.nextInt();
			int mes =  scanner.nextInt();
			int anio = scanner.nextInt();
			
			Fecha f1 = new Fecha(dia,mes,anio);
			
			System.out.println("Ingrese Fecha 2 (dia, mes ,anio): ");
			String sFecha = scanner.next();
			
			Fecha f2 = new Fecha(sFecha);
			
			System.out.println("Fecha 1:" +f1);
			System.out.println("Fecha 2:" +f2);
			
			if(f1.equals(f2)) {
				System.out.println("Son iguales");
			}else {
				System.out.println("No son iguales");
			}

	}

}
