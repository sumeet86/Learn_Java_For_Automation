package com.testng;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Class2 extends ObjectCreation {
	
	//ArrayList<String> ar;
	
	
	@Test
	public void test1() {
		System.out.println(ObjectCreation.ar);
		System.out.println(ar.get(3));
		
	}
	@Test
	public void test2() {
		System.out.println(ar.get(2));
	}
}
