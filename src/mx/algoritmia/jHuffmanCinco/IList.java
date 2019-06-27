package mx.algoritmia.jHuffmanCinco;
import java.util.*;

public interface IList {

	//desenlaza y retorna el primer nodo de la lista
	public Node removeFirstNode();
	
	//agrega el nodo n segun el criterio de ordenamiento
	public void addNode(Node n);
	
	//convierte la lis en un arbol y lo retorna
	//no usar el medoto remove FirstNode
	public ITree toTree();
	
	//retorna una iinstancia(implementacion) de Comparator<Node> tal que permita
	//determinar si un nodo precede o no a otro segin el criterio de ordenamiento antes mencionado
	
	public Comparator<Node> getComparator();
	
}
