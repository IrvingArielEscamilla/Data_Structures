package mx.algoritmia.jHuffmanCinco;
import java.util.Comparator;

public interface ITree {
	
	//asigna la raiz del arbol
	public void setRoot(Node root);
	
	//retorna la raiz del arbol
	public Node getRoot();
	
	//cada invocacion retorna la sigueinte hoaj de arbol comenzando desde la que esta mas a la "izquerda" No utilizar el metodo next de la clase Utree
	
	public Node next(ICode cod);
}
