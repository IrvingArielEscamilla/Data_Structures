package mx.algoritmia.jHuffmanCinco;

public interface IFileCompressed {
	//asigna el nombre del archivo
	public void setFilename(String filename);
	
	//retorna el nombre del archivo
	public String getFilename();
	
	/*graba el archivo comprimido recorriendo el archivo de 
	 entrada y reemplazando cada caracter  por su correspondiente
	 codigo Huffman. AL principio del archivo debe grabar in long con la lingitud
	 en bytes que tenia el archivo original.
	 No usar los metodos writeLenght y writeBit de la clase UFile*/
	
	public void save(IFileInput inputFile, ITable table);
	
	/* restaura el archivo original recorriendo el archivo comprimido y , por cada bit leido,
	 * se desplaza por la ramas dela arbol hasta llegar a la hoja que contiene el caracter por escribir
	 * Recordar que los primeros bytes del archivo .szdat indican la longitud en bytes del archivo 
	 * original.
	 * No usar los metodos readLenght y readBit de la clase UFile
	 */
	
	public void restore(IFileInput inputFile, ITree tree);
	
}
