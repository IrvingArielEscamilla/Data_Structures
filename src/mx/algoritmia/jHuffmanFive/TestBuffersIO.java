package mx.algoritmia.jHuffmanCinco;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class TestBuffersIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			//nombre de archivo de origen
			String desde = args[0];
			
			//nombre del archivo de destino
			String hasta = args[1];
			
			bis = new BufferedInputStream(new FileInputStream(desde));
			bos = new BufferedOutputStream(new FileOutputStream(desde));
			
			//leemos el primer byte desde el buffer de entrada
			int c = bis.read();
			
			while(c!=-1) {
				
					//escribimos el byte en el buffer de salida
					bos.write(c);
					
					//leemos el siguiente byte
					c = bis.read();
			}
			
			//vaciamos el contenido del buffer
			bos.flush();
		}catch(Exception ex){
			
			ex.printStackTrace();
			throw new RuntimeException(ex);
			
		}finally {
			
			try {
				
					if(bos!=null) bos.close();
					if(bis!=null) bis.close();
					
			}catch(Exception ex) {
				
				ex.printStackTrace();
				throw new RuntimeException(ex);
				
			}
		}
	}

}
