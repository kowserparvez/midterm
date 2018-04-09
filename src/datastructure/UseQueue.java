package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<String> queue = new LinkedList<>();
		queue.add("taheem");
		queue.add("keyaan");
		queue.add("ameen");
		queue.add("boomboom");
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		System.out.println(queue.peek());

		for (String str : queue){
			System.out.println(str);
		}
		Iterator iterator = queue.iterator();
		while (iterator.hasNext()){
			String string = (String) iterator.next();
			System.out.println(string);
		}

	}

}
