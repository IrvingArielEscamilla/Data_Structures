package mx.algoritmia.CapituloDos;
import java.util.*;

public class Cadenas7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Irving|Merit|Sandy|Mem|Alfredo";
		StringTokenizer st = new StringTokenizer(s, "|");
		
		String tok;
		while(st.hasMoreTokens()) {
			tok = st.nextToken();
			System.out.println(tok);
		}
	}	
}
