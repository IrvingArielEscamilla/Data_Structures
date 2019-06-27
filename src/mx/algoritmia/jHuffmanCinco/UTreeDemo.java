package mx.algoritmia.jHuffmanCinco;


public class UTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//obtenmos el arbol Huffman
		Node root = crearArbolHuffman();
		
		//instanciamos  un objeto de la clase UTree a partir de la raiz del arbol
		UTree uTree = new UTree(root);
		 //buffer donde el metodo next asignara los codigos Huffman
		StringBuffer codHuffman = new StringBuffer();
		
		//obtenemos la primera hoja
		Node hoja =  uTree.next();
		
		//iteramos mientras el metodo no retorne null
		while(hoja!=null) {
			//mostramos la hoja leida
			String s = ((char)hoja.getC()) + "(" + hoja.getN() + ")";
			System.out.println(s + "codigo = {" + codHuffman + "}");
			
			//obtenemos la siguiente hoja
			hoja = uTree.next(codHuffman);
		}
	}

	private static Node crearArbolHuffman() {
		
		//nivel 5 (ultimo nivel)
		
		Node nS =  node('S',1,null,null);
		Node nR =  node('R',1,null,null);
		Node nN =  node('N',1,null,null);
		Node nI =  node('U',1,null,null);
		
		//nivel 4
		Node a2 =  node(256+2,2,nS,nR);
		Node a1 =  node(256+1,2,nN,nI);
		Node nT =  node('T',2,null,null);
		Node nE =  node('E',2,null,null);
		Node nA =  node('A',2,null,null);
		Node nU =  node('U',1,null,null);
		
		//nivel 3
		
		Node nC =  node('C',7,null,null);
		Node nM =  node('M',5,null,null);
		Node nESP =  node(' ',5,null,null);
		Node a5 =  node(256+5,4,a2,a1);
		Node a4 =  node(256+4,4,nT,nE);
		Node a3 =  node(256+3,3,nA,nU);
		
		//nivel 2
		
		Node a8 =  node(256+8,12,nC,nM);
		Node nO =  node('O',3,nA,nU);
		Node a7 =  node(256+7,9,nESP,a5);
		Node a6 =  node(256+9,16,a7,a3);
		
		//nivel 1
		Node a10 = node(256+10,23,a8,nO);
		Node a9  = node(256+9,16,a7,a6);
		 
		//nivel 0 (raiz)
		Node all = node(256+11,39,a10,a9);
		
		return all;
		
		
	}

	
	private static Node node (int c, long n, Node izq, Node der) {
		Node node = new Node();
		node.setC(c);
		node.setN(n);
		node.setIzq(izq);
		node.setDer(der);
		node.setSig(null);
		return node;
	}
}
