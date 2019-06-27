package mx.algoritmia.CapituloSeis;

public class PermutacionesRec {
	
	/* Recibe la candea s y la cadena auxiliar sb, recodemos
	 * que sb tiene todos los caracteres sustraidos
	 */
	
	public static void mostrarPermutaciones(String s, StringBuffer aux) {
		/* La condicion de corte s.length()<3 , si la cadena
		 * tiene menos de 3 caracteres entonces podemos mostrar
		 * las dos permutaciones posibles.
		 */
		
		if(s.length()< 3) {
			
			//Mostramos los caracteres sustraidos seguidos de la primera permutacion
			System.out.println(aux + "" + s.charAt(0) + "" + s.charAt(1));
			
			//Mostramos los caracteres sustraidos seguidos de la segunda permutacion
			System.out.println(aux + "" + s.charAt(1) + "" + s.charAt(0));
		}else {
			
			//Si la cadena tiene 3 o mas caracteres...
			for (int i=0; i<s.length(); i++) {
				
				//tomamos el i-esimo caracter
				char c =s.charAt(i);
				
				//lo agregamos al historial de caracteres sustraido
				aux.append(c);
				
				//lo eliminamos de la cadena
				String s1 = UString.removeChar(s,i);
				
				//la llamada recursiva con un caracter menos
				mostrarPermutaciones(s1,aux);
				
				//removemos el caracter sustraido de la cadena aux
				aux.deleteCharAt(aux.length()-1);
				
			}
		}
	}
	
	public static void main (String[]  args) {
		
		System.out.println("Entre valor para la cadena (s); ");
		//tomamos la cadena por linea de comandos
		String cadena = args[0];
		
		//la procesamos
		mostrarPermutaciones(cadena, new StringBuffer());
	}

	
	

}

