package org.howard.edu.lsp.assignment5.test;
import org.howard.edu.lsp.assignment5.implementation.IntegerSet; // Importing IntegerSet class

public class Driver {

	public static void main(String[] args) throws Exception {
		IntegerSet set1 = new IntegerSet(); // Making an IntegerSet called set1
		set1.add(2); // Adding a few elements
		set1.add(4);
		set1.add(8);
		set1.add(4);
		set1.add(6);
		System.out.println(set1.toString()); // You can see that 4 was not added twice
		System.out.println(set1.length()); // Length function is working
		IntegerSet set2 = new IntegerSet();
		set2.add(2);
		set2.add(4);
		set2.add(6);
		set2.add(8);
		System.out.println(set1.equals(set2)); // Equals function is working
		System.out.println(set1.contains(1));
		System.out.println(set1.contains(4)); // Contains function is working
		System.out.println("Smallest value in Set1 is: "+ set1.smallest());
		System.out.println("Largest value in Set1 is: " + set1.largest()); // Smallest and Largest functions working
		set1.remove(4);
		System.out.println(set1.toString()); // Remove function is working
		set2.clear(); // Clear function is working
		set2.add(1);
		set2.add(9);
		set1.union(set2);
		System.out.println(set1.toString()); // Union is working
		set2.clear();
		set2.add(10);
		set2.add(19);
		set2.add(24);
		set2.add(6);
		set1.intersect(set2);
		System.out.println(set1.toString()); // Intersect is working
		set1.add(24);
		set2.difference(set1);
		System.out.println(set2.toString()); // Difference is working
		set1.clear();
		set2.clear();
		System.out.println(set1.isEmpty()); // Is Empty function is working
	}

}
