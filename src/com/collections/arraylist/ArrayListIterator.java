package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Sumeet");
		ar.add("Santosh");
		ar.add("Ajay");
		ar.add("Deepak");
		ar.add("Sanajy");
		Iterator<String> it=ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
