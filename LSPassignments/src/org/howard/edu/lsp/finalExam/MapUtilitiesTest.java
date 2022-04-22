package org.howard.edu.lsp.finalExam;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class MapUtilitiesTest {

	@Test
	void emptyMap() throws NullMapException {
		HashMap<String,String> hashmap1 = new HashMap();
		HashMap<String,String> hashmap2 = new HashMap();
		hashmap1.put("Alice", "Healthy");
		hashmap1.put("Mary", "Ecstatic");
		hashmap1.put("Bob", "Happy");
		hashmap1.put("Chuck", "Fine");
		hashmap1.put("Felix", "Sick");
		var maputils = new MapUtilities();
		assertEquals((maputils.commonKeyValuePairs(hashmap1,hashmap2)),0);
	}

}
