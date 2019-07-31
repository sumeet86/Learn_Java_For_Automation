package com.testng;

import java.util.ArrayList;

public class ObjectCreation {
	public static ArrayList<String> ar;

	public static ArrayList<String>  Arraylist1() {
		ar = new ArrayList<String>();
		ar.add("Sumeet");
		ar.add("Santosh");
		ar.add("Ajay");
		ar.add("Deepak");
		ar.add("Sanajy");
		return ar;
	}

}
