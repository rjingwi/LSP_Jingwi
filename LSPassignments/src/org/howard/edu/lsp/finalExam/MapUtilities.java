package org.howard.edu.lsp.finalExam;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Set;

public class MapUtilities {
	
	public static int commonKeyValuePairs(HashMap<String, String> map1,HashMap<String, String> map2) throws NullMapException {
		
		try {
			if ((map1 == null) || (map2 == null)){
				throw new NullMapException();
			}
		}
		catch(NullMapException e){
			System.out.print(e.getMessage());
		}
		
		if(map1.isEmpty() || map2.isEmpty()) {
			return 0;
		}
		
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

}
