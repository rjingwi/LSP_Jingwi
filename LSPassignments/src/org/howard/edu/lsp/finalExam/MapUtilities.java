package org.howard.edu.lsp.finalExam;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;

public class MapUtilities {
	
	public static int commonKeyValuePairs(HashMap<String, String> map1,HashMap<String, String> map2) {
		Iterator<Entry<String,String>> iterator = map1.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String,String> entry = iterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		return 0;
	}

	public static void main(String[] args) {
		HashMap<String,String> hashmap1 = new HashMap();
		HashMap<String,String> hashmap2 = new HashMap();
		hashmap1.put("Alice", "Healthy");
		hashmap1.put("Mary", "Ecstatic");
		hashmap1.put("Bob", "Happy");
		hashmap1.put("Chuck", "Fine");
		hashmap1.put("Felix", "Sick");
		hashmap2.put("Mary", "Ecstatic");
		hashmap2.put("Felix", "Healthy");
		hashmap2.put("Bob", "Happy");
		
		commonKeyValuePairs(hashmap1,hashmap2);
		
	}

}
