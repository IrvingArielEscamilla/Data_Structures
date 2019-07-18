package mx.algoritmia.jHuffmanCinco;
import java.io.FileOutputStream;

public class TestOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = null;
		try {
			
			String nombreArchivo = args[0];
			String textAGrabar =  args[1];
			
			//abrimos el archivo para escritura
			fos = new FileOutputStream (nombreArchivo);
			//recorremos la cadena
			
			for(int i=0; i<textAGrabar.length();i++) {
				int c = textAGrabar.charAt(i);
				//grabamos el siguiente byte
				fos.write(c);
				
			}
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

}
