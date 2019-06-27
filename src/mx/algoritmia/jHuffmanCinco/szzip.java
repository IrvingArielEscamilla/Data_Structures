package mx.algoritmia.jHuffmanCinco;

public class szzip {

	public static void main(String[] args) {
		
		//abrimos el archivo a comprimir
		IFileInput inputFile = (IFileInput) UFactory.getObject("inputFile");
		fi.setFilename(args0[0]);
		
		//tabla de ocurrencias
		ITable table = inputFile.createTable();
		
		//obtenemos la lista enlazada
		IList list = table.createSortedList();
		
		//convertimos la lista en un arbol
		ITree tree = list.toTree();
		
		//asignamos lo codigos en la tabla
		table.loadHuffmanCodes(tree);
		
		//abrimos el archivo de codigo
		IFile codeFilfe = (IFileCode) UFactory.getObject("codeFile");
		codeFile.setFilename(args[0] + ".zscod");
		
		//grabamos el archivo tomando los codigos del arbol
		codeFile.save(table);
		
		//abrimos el archivo comprimido
		IFileCompressed compressFile = (IFileCompressed) UFactory.getObject("compressFile");
		compressFile.setFilename(args[0] + ".szdat");
		
		//grabamos el archivo comprimido
		compressFile.save(inputFile,table);
		
		
	}
}
