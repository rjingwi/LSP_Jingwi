package org.howard.edu.lsp.assignment5.implementation;
import java.util.ArrayList;


public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	private ArrayList<Integer> IntSet = new ArrayList<Integer>();

	// Default Constructor
	IntegerSet() {}

	// Clears the internal representation of the set
	public void clear() {
		IntSet.clear();
	};

// Returns the length of the set
	public int length() {
		return IntSet.size();
	}; // returns the length

/*
              * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.
*/
	public boolean equals(IntegerSet b) {
		if (IntSet == b.IntSet) {
			return true;
		}
		else {
			return false;
		}
	}; 

// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		if (IntSet.contains(value)) {
			return true;
			}
		else {
			return false;
		}
		};

// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
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

// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest() throws Exception{
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

	// Adds an item to the set or does nothing it already there	
 	public void add(int item) {
 		if(!IntSet.contains(item)) {
 			IntSet.add(item);
 		}
 	}; // adds item to the set or does nothing if it is in set

	// Removes an item from the set or does nothing if not there
 	public void remove(int item) {
 		if(IntSet.contains(item)) {
 			IntSet.remove(IntSet.indexOf(item));
 		}
 	};

// Set union
 	public void union(IntegerSet intSetb) {
 		for(int i =0; i < intSetb.IntSet.size();i++) {
 			if(!IntSet.contains(intSetb.IntSet.get(i))){
 				IntSet.add(intSetb.IntSet.get(i));
 			}
 		}
 	};

// Set intersection
 	public void intersect(IntegerSet intSetb) {
 		ArrayList<Integer> Intersection = new ArrayList<Integer>();
 		for(int i =0; i < intSetb.IntSet.size();i++) {
 			if((IntSet.contains(intSetb.IntSet.get(i))) && (!Intersection.contains(intSetb.IntSet.get(i)))){
 				Intersection.add(intSetb.IntSet.get(i));
 			}
 		}
 		IntSet.clear();
 		IntSet = Intersection;
 	}; 

// Set difference, i.e., s1 –s2
 	public void diff(IntegerSet intSetb) {
 		for(int i =0; i > intSetb.IntSet.size();i++) {
 			if(IntSet.contains(intSetb.IntSet.get(i))){
 				IntSet.remove(IntSet.indexOf(intSetb.IntSet.get(i)));
 			}
 		}
 	}; // set difference, i.e. s1 - s2

// Returns true if the set is empty, false otherwise
 	public boolean isEmpty(){
 		return IntSet.isEmpty();
 	}; 

// Return String representation of your set
 	public String toString() {
 		return IntSet.toString();
 	};	// return String representation of your set
}

