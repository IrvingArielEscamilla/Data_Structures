package mx.algoritmia.jHuffmanCinco;

public interface ITable {

	//incrementa el contador relacionado al caracter (o byte) c
	public void addCount(int c);
	
	//retonra le valor del contador asiciada al carcter (o byte) c
	public long getCount(int c);
	
	//crea una lista enlazada
	public IList createSortedList();
	
	//almacena en la tabla el codigo Huffman asignado a cada caracter 
	//no usar el metodo next del parametro Tree
	public void loadHuffmanCodes(ITree tree);
	
	//retorna el codifo Huffman asignado al caracter c
	public ICode getCode(int c);
	
}
