package org.howard.edu.lsp.assignment5.implementation;
import java.util.ArrayList;


public class IntegerSet  {
	/* Array List is used for Set data 
	 */
	private ArrayList<Integer> IntSet = new ArrayList<Integer>();

	// Default Constructor
	public IntegerSet() {}

	/* Clears the internal representation of the set
	 */
	public void clear() {
		IntSet.clear();
	};

	/* Returns the length of the set
	 */
	public int length() {
		return IntSet.size();
	};

/*
              * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.
*/
	public boolean equals(IntegerSet b) {
		if(!(IntSet.size() == b.length())) {
			return false;
		}
		else {
			for(int i = 0;i<b.length();i++) {
				if(!IntSet.contains(b.IntSet.get(i))) {
					return false;
				}
			}
		}
		return true;
	}; 

/* Returns true if the set contains the value, otherwise false
 */
	public boolean contains(int value) {
		if (IntSet.contains(value)) {
			return true;
			}
		else {
			return false;
		}
		};

/* Returns the largest item in the set; Throws a IntegerSetException if the set is empty
 */
	public int largest() throws Exception{
		if (!IntSet.isEmpty()) {
			int largest = IntSet.get(0);
			for(int i = 0;i < IntSet.size();i++) {
				if (IntSet.get(i) > largest) {
					largest = IntSet.get(i);
				}
			}
			return largest;
		}
		else {
			throw new Exception("IntegerSetException");
		}
	}; 

/* Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
 */	public int smallest() throws Exception{
		if (!IntSet.isEmpty()) {
			int smallest = IntSet.get(0);
			for(int i = 0;i < IntSet.size();i++) {
				if (IntSet.get(i) < smallest) {
					smallest = IntSet.get(i);
				}
			}
			return smallest;
		}
		else {
			throw new Exception("IntegerSetException");
		}
	}; 

	/* Adds an item to the set or does nothing it already there
	 */
 	public void add(int item) {
 		if(!IntSet.contains(item)) {
 			IntSet.add(item);
 		}
 	};

	/* Removes an item from the set or does nothing if not there
	 */
 	public void remove(int item) {
 		if(IntSet.contains(item)) {
 			IntSet.remove(IntSet.indexOf(item));
 		}
 	};

 	/* Gives all elements of both sets joined
 	 */
 	public void union(IntegerSet intSetb) {
 		for(int i =0; i < intSetb.IntSet.size();i++) {
 			if(!IntSet.contains(intSetb.IntSet.get(i))){
 				IntSet.add(intSetb.IntSet.get(i));
 			}
 		}
 	};

 	/* Gives all elements that are in both sets
 	 */
 	public void intersect(IntegerSet intSetb) {
 		ArrayList<Integer> intersection = new ArrayList<Integer>();
 		for(int i =0; i < intSetb.IntSet.size();i++) {
 			if((IntSet.contains(intSetb.IntSet.get(i))) && (!intersection.contains(intSetb.IntSet.get(i)))){
 				intersection.add(intSetb.IntSet.get(i));
 			}
 		}
 		IntSet.clear();
 		IntSet = intersection;
 	}; 

 	/* Removes the elements that are in the second set from the first set
 	 */
 	public void difference(IntegerSet intSetb) {
 		ArrayList<Integer> difference = new ArrayList<Integer>();
 		for(int i = 0;i<IntSet.size();i++) {
 			if(!intSetb.contains(IntSet.get(i))){
 				difference.add(IntSet.get(i));
 			}
 		}
 		IntSet = difference;
 	};

 	/* Returns true if the set is empty, false otherwise
 	 */
 	public boolean isEmpty(){
 		return IntSet.isEmpty();
 	}; 

 	/* Returns string representation of the set
 	 */
 	public String toString() {
 		return IntSet.toString();
 	};
}

