package org.howard.edu.lsp.finalExam;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Set;

public class MapUtilities {
	
	public static int commonKeyValuePairs(HashMap<String, String> map1,HashMap<String, String> map2) throws NullMapException {
		int result = 0;
		Iterator<Entry<String,String>> iterator = map1.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String,String> entry = iterator.next();
			if(map2.keySet().contains(entry.getKey())) {
				if((map1.get(entry.getKey()) == map2.get(entry.getKey()))){
					result ++;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) throws NullMapException {
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
		
		System.out.print(commonKeyValuePairs(hashmap1,hashmap2));
		
	}

}
