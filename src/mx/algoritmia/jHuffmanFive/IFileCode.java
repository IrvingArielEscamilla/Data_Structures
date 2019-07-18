package mx.algoritmia.jHuffmanCinco;

public interface IFileCode {
	//asigna el nombre del archivo
	public void setFilenname (String f);
	
	//graba un archivo tomando los codigo Huffman de la tabla
	//no usar el metodo writeBit de la clase UFile
	public void save(ITable table);
	
	//lee el archivo (ya generado) y contruye el arbol HUffman
	// no usar el metodo readBit de la calse UFile
	//Tambien es probalbe que se necestie utilzar el metodo
	//parseInt de la clase Integer para convertir un numero binario
	//en un valor entero, asi:
	//int v = Integer.parseInt("10101",2) retorna le valor 21
	
	public ITree load();
	
}
