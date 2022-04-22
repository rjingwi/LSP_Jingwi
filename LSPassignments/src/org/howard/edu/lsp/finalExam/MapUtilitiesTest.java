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
		assertEquals(0,(maputils.commonKeyValuePairs(hashmap1,hashmap2)));
	}
	
	@Test
	void basicFunctionality() throws NullMapException{
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
		var maputils = new MapUtilities();
		assertEquals(2,(maputils.commonKeyValuePairs(hashmap1,hashmap2)));
	}
	
	@Test
	void noValuesInCommon() throws NullMapException{
		HashMap<String,String> hashmap1 = new HashMap();
		HashMap<String,String> hashmap2 = new HashMap();
		hashmap1.put("Alice", "Healthy");
		hashmap1.put("Chuck", "Fine");
		hashmap2.put("Felix", "Healthy");
		hashmap2.put("Bob", "Happy");
		var maputils = new MapUtilities();
		assertEquals(0,(maputils.commonKeyValuePairs(hashmap1,hashmap2)));
	}
	
	@Test
	void allValuesInCommon() throws NullMapException{
		HashMap<String,String> hashmap1 = new HashMap();
		HashMap<String,String> hashmap2 = new HashMap();
		hashmap1.put("Mary", "Ecstatic");
		hashmap1.put("Bob", "Happy");
		hashmap1.put("Felix", "Healthy");
		hashmap2.put("Mary", "Ecstatic");
		hashmap2.put("Bob", "Happy");
		hashmap2.put("Felix", "Healthy");
		var maputils = new MapUtilities();
		assertEquals(3,(maputils.commonKeyValuePairs(hashmap1,hashmap2)));
	}
	
	@Test
	void testExpectedException() {
		var maputils = new MapUtilities();
		HashMap<String,String> hashmap1 = new HashMap();
		hashmap1.put("Alice", "Healthy");
		hashmap1.put("Mary", "Ecstatic");
		assertThrows(NullMapException.class,()-> maputils.commonKeyValuePairs(hashmap1,null));
	}
}
