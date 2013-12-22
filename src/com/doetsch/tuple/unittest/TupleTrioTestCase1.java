package com.doetsch.tuple.unittest;

import com.doetsch.tuple.TupleTrio;
import org.junit.Assert;
import org.junit.Test;

/*
 * A unit test for the TupleTrio class.
 */
public class TupleTrioTestCase1 {

	/*
	 * Tests instantiation of TupleTrio.
	 * Checks that the given construction
	 * values are properly applied to the
	 * TupleTrio.
	 */
	@Test
	public void testConstruction () {
		TupleTrio<String, String, Integer> trio =
				new TupleTrio<String, String, Integer>
				("bake", "cake", 17);
		
		Assert.assertTrue(trio.a.equals("bake"));
		Assert.assertTrue(trio.b.equals("cake"));
		Assert.assertTrue(trio.c == 17);
	}

	/*
	 * Tests the equals() method of the
	 * TupleTrio. Two TupleTrio objects with the
	 * same instantiation values should be considered
	 * equal by equals().
	 */
	@Test
	public void testEquals () {
		TupleTrio<String, String, Integer> trio1 =
				new TupleTrio<String, String, Integer>
				("bake", "cake", 17);
		
		TupleTrio<String, String, Integer> trio2 =
				new TupleTrio<String, String, Integer>
				("bake", "cake", 17);
		
		Assert.assertTrue(trio1.equals(trio2));
	}

	/*
	 * Tests the equals() method of the
	 * TupleTrio. Two TupleTrio objects with different
	 * instantiation values should be considered
	 * unequal by equals().
	 */
	@Test
	public void testNotEquals () {
		TupleTrio<String, String, Integer> trio1 =
				new TupleTrio<String, String, Integer>
				("bake", "cake", 17);
		
		TupleTrio<String, String, Integer> trio2 =
				new TupleTrio<String, String, Integer>
				("bake", "cake", 23);
		
		Assert.assertTrue(!trio1.equals(trio2));
	}

	/*
	 * Execute the unit test.
	 */
	public static void main (String[] args) {
		TupleTrioTestCase1 testCase =
				new	TupleTrioTestCase1 ();
		
		testCase.testConstruction();
		
		testCase.testEquals();
		
		testCase.testNotEquals();
		
	}
	
}
