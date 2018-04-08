package datastructure;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("NFL");
		myList.add("NBA");
		myList.add("MLB");
		myList.add("NHL");
		for(String list : myList){
			System.out.println(list);
		}

		Iterator<String> teams = myList.iterator();
		while (teams.hasNext()){
			System.out.println(teams.hasNext());
		}


	}

}
