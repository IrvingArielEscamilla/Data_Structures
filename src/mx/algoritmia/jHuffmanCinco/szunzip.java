package mx.algoritmia.jHuffmanCinco;
import mx.algoritmia.jHuffmanCinco.def.*;
import mx.algoritmia.jHuffmanCinco.util.UFactory;

public class szunzip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //abrimos el archivo de codigos
		
		IFileCode codeFile = (IFileCode) UFactory.getbject("codeFile");
		codeFile.setFilename(args[0] + ".szcod");
		
		//leemos el archivo y generamos el arbol
		ITree tree = codeFile.load();
		
		//abrimos el archivo comprimido
		IFileCompressed compressFile = (IFileCompressed) UFactory.getObject("compressFile");
		compressFile.setFilename(args[0] + ".szdat");
		
		//abrimos el archivo original
		IFileInput inputFile = (IFileInput) UFactory.getObject("inputFile");
		inputFile.setFilename(args[0] );
		
		//recuperamos el archivo original
		compressFile.restore(inputFile,tree);
		
	}

}
