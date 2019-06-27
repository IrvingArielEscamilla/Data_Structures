package mx.algoritmia.CapituloDos;
import java.util.Scanner;

public class DemoConstantes {
	public static final int LUNES = 1;
	public static final int MARTES = 2;
	public static final int MIERCOLES = 3;
	public static final int JUEVES = 4;
	public static final int VIERNES = 5;
	public static final int SABADO = 6;
	public static final int DOMINGO = 7;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame un dia de la semana: ");
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
