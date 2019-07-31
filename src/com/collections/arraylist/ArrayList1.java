package com.collections.arraylist;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

		// Creating array object list
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Sumeet");
		ar.add("Kumar");
		ar.add("Ajay");
		ar.add("Deepak");
		ar.add("Sanajy");
		System.out.println(ar);
		System.out.println(ar.get(2));

		// Searching an element present or not

		System.out.println("Sanjeev is present: " + ar.contains("Sanjeev"));
		System.out.println("Sumeet is present: " + ar.contains("Sumeet"));

		// adding element to specific index

		ar.add(3, "Rajeev");
		System.out.println(ar);

		// Checking Array list is empty or not

		System.out.println("Array list is Empty: " + ar.isEmpty());

		// getting index of element
		System.out.println("Deepak index number is: " + ar.indexOf("Deepak"));
		// size of array list
		System.out.println("Size of array list: " + ar.size());

	}

}
