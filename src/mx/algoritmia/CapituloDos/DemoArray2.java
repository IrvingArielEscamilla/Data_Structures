package mx.algoritmia.CapituloDos;
import java.util.*;

public class DemoArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String dias[] = {"LUNES", "MARTES" , "MIERCOLES", "JUEVES" , "VIERNES","SABADO", "DOMINGO "};
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Ingrese un dia de la semana (numero): ");
		 int v = scanner.nextInt();
		 
		 if (v <= dias.length) {
			 
			 System.out.println(dias [v-1]);
			 
		 }else {
			 System.out.println("Dia incorrecto");
		 }
	}

}
