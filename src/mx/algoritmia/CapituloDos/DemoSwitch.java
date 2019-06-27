package mx.algoritmia.CapituloDos;
import java.util.*;



public class DemoSwitch {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un dia de la semana (1 a 7): ");
		int v = scanner.nextInt();
		
		String dia;
		
		switch(v) {
		
		case 1:
			dia = "LUNES";
			break;
		case 2:
			dia = "MARTES";
			break;
		case 3:
			dia = "MIERCOLES";
			break;
		case 4:
			dia = "JUEVES";
			break;
		case 5:
			dia = "VIERNES";
			break;
		case 6:
			dia = "SABADO";
			break;
		case 7:
			dia = "DOMINGO";
			break;
		default:
			dia = "Dia incorrecto...Ingrese un valor correspodientea la planeta tierra";
		
		
		}
		
		System.out.println(dia);
		
	}

}
