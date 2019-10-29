package com.testng;

import java.util.ArrayList;

import org.testng.annotations.BeforeClass;

public class ObjectCreation {
	protected static ArrayList<String> ar;
    
	 @BeforeClass
	public static void  Arraylist1() {
		ar = new ArrayList<String>();
		ar.add("Sumeet");
		ar.add("Santosh");
		ar.add("Ajay");
		ar.add("Deepak");
		ar.add("Sanajy");
		
	}

}
