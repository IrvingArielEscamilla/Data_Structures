package mx.algoritmia.jHuffmanCinco;

import java.io.FileInputStream;

public class TestFileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		
		try {
			//el nombre del archivo se debe pasar en linea de comandos
			String nombreArchivo =  args[0];
			
			//abrimos el archivo
			fis = new FileInputStream(nombreArchivo);
			
			//contador para los bytes que tiene el archivo
			int cont = 0;
			
			//leemos el primer byte
			int c = fis.read();
			
			//iteramos  mientras no llegue el EOF, representado por -1
			
			while (c!=-1) {
				cont ++;
				//leemos el siguiente byte
				c = fis.read();
			}
			
			System.out.println(nombreArchivo + " tiene " + cont + " bytes");
		
		}catch(Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
			
		}finally {
			
			try {
				//cerramos el archivo
				if(fis!= null) fis.close();
			}catch(Exception ex) {
				
				ex.printStackTrace();
				throw new RuntimeException(ex);
			}
			
		}
		
	}

}
