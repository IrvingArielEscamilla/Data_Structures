package mx.algoritmia.jHuffmanCinco;

public interface IFileInput {

	//asigna el nombre del archivo
	public void setFilename(String filename);
	
	//retorna el nombre del archivo
	public String getFilename();
	
	//crea  y retonra la tabla de ocurrencias con los contadores de los diferentes
	//bytes que aparecen en el archivo
	public ITable createTable();
	
	//retorna la lingitud del archivo
	public long getLength();
	
}
