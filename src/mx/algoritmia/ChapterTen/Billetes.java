package mx.algoritmia.CapituloDiez;

import java.util.ArrayList;
import java.util.Collection;

public class Billetes {

	public static Collection<CantBillete> pagar(int monto, int[] denom){
		
		int i=0;
		int suma=0;
		int cant=0;
		
		ArrayList<CantBillete> ret = new ArrayList<CantBillete>();
		while(i<denom.length && suma<=monto) {
			if(suma+denom[i]<=monto) {
				suma+=denom[i];
				cant++;
				
			}else {
				if(cant>0) {
					ret.add(new CantBillete(denom[i],cant));
					cant =0;
				}
				i++;
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		int denom[] = {100,50,20,10,5,2,1};
		
		int importeAPagar = 2543;
		Collection<CantBillete> ret = pagar(importeAPagar,denom);
		for(CantBillete a:ret) {
			System.out.println(a.getCant()+ " billetes de: " + a.getDenom());
		}
	}
}
