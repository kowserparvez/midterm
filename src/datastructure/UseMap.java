package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1,"taheem");
		map.put(2,"keyaan");
		map.put(3,"ameen");
		//System.out.println(map.get(2));
		for (Map.Entry entry: map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());

		}

		List<String> taheemsToys = new ArrayList<>();
		taheemsToys.add("train");
		taheemsToys.add("boat");
		taheemsToys.add("plane");

		List<String> keyaanToys = new ArrayList<>();
		keyaanToys.add("car");
		keyaanToys.add("bike");
		keyaanToys.add("pawtroll");

		List<String> ameenToys = new ArrayList<>();
		ameenToys.add("book");
		ameenToys.add("ipad");
		ameenToys.add("xbox");

		Map<String, List<String>> newMap = new LinkedHashMap<String, List<String>>();
		newMap.put("taheem",taheemsToys);
		newMap.put("keyaan",keyaanToys);
		newMap.put("ameem",ameenToys);

		for(Map.Entry entry:newMap.entrySet()){
			System.out.println(entry.getKey()+"  "+ entry.getValue() );
		}



	}

}
