package mx.algoritmia.jHuffmanCinco;

public interface ICode {

	//retorna el i-esimo bit (contando desde cero, de izq a der
	
	public int getBitAt(int i);
	
	//retorna la longitusd de este codigo huffman (valor entre 1 y 128)
	public int getLength();
	
	//inicializa el codigo huffman con los caracteres de sCod que genera "1 y 0"
	public void fromString(String sCod);
	
}
