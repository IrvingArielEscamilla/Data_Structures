package mx.algoritmia.jHuffmanCinco;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class UFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //grabamos en DEMO.dat los bits: 1011101101110
		grabarBits("Demo.dat", "1011101101110");
		
		//recorremos DEMO.dat "bit x bit" e imprimos cada bit leido
		leerBits("Demo.dat");
		
		private static void grabarBits(String nomArch, String bits) {
			
			FileOutputStream fos = null;
			
			try {
				
				//abrimos el archivo para grabar los bits
				fos = new FileOutputStream(nomArch);
				 //instanciamos Ufile
				UFile uFILE = new UFile(fos);
				 //recorremos la cadena de bit que queremos escribir
				
				for(int i=0; i<bits.length();i++) {
					//obtenemos el i-esimo bit (1-0)
					int bit =  bits.charAt(i)-'0';
					//lo grabamos en el archivo
					uFile.writeBit(bit);
				}
				
				// si quedo un paquete a medio formar lo completamos con
				//ceros ala derecha y lo grabamos
				uFile.flush();
			}catch(Exception ex) {
				
				ex.printStackTrace();
				throw new RuntimeException(ex);
				
			}finally {
				
				try {
						if(fos!=null) fos.close();
				}catch(Exception ex){
						ex.printStackTrace();
						throw new RuntimeException(ex);
				}
			}
		}
	
	private static void leerBits(String nomArch) {
		
		FileInputStream fis  = null;
		
		try {
			
			//abrimos el archivo para grabar los bits
			fis = new FileInputStream(nomArch);
			//intanciamos UFile
			UFile uFile = new UFile(fis);
			//recorremos la cadena de bits
			int bit = uFile.readBit();
			//cuando no haya mas bits retornara un valor negativo
			while(bit>=0) {
				//mostramos el bit
				System.out.println(bit);
				//leemos el proximo bit
				bit = uFile.readBit();
				
			}
		}catch(Exception ex) {
			
			ex.printStackTrace();
			throw new RuntimeException(ex);
			
		}finally {
			
			try {
				
			
				if(fis!=null) fis.close();
				
				}catch(Exception ex) {
					
						ex.printStackTrace();
						throw new RuntimeException(ex);
				}
		}
	}

}
