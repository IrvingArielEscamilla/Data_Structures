package mx.algoritmia.CapituloCuatro;
import java.util.*;

public class DemoQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		System.out.println(q.poll());
		System.out.println(q.poll());
		q.offer(4);
		q.offer(5);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
	}

}
