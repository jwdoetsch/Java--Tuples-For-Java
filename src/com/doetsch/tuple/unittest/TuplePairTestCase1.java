package com.doetsch.tuple.unittest;

import com.doetsch.tuple.TuplePair;
import org.junit.Assert;
import org.junit.Test;

/*
 * A unit test for the TuplePair class.
 */
class TuplePairTestCase1 {

	/*
	 * Tests instantiation of TuplePair.
	 * Checks that the given construction
	 * values are properly applied to the
	 * TuplePair.
	 */
	@Test
	public void testConstruction () {
		TuplePair<String, Integer> pair = 
				new TuplePair<String, Integer>
				("key", 128);
		
		Assert.assertTrue(pair.a == "key");
		Assert.assertTrue(pair.b == 128);
	}
	
	/*
	 * Tests the equals() method of the
	 * TuplePair. Two TuplePairs with the same
	 * instantiation values should be considered
	 * equal by equals(). 
	 */
	@Test
	public void testEquals () {
		TuplePair<String, Integer> pair1 = 
				new TuplePair<String, Integer>
				("key", 127);
		
		TuplePair<String, Integer> pair2 = 
				new TuplePair<String, Integer>
				("key", 127);
		
		Assert.assertTrue(pair1.equals(pair2));
	}

	/*
	 * Tests the equals() method of the
	 * TuplePair. Two TuplePairs with different
	 * instantiation values should be considered
	 * unequal by equals(). 
	 */
	@Test
	public void testNotEquals () {
		TuplePair<String, Integer> pair1 = 
				new TuplePair<String, Integer>
				("key", 255);
		TuplePair<String, Integer> pair2 = 
				new TuplePair<String, Integer>
				("key", 0);
		
		Assert.assertFalse(pair1.equals(pair2));
	}

	/*
	 * Execute the unit test.
	 */
	public static void main (String[] args) {
		TuplePairTestCase1 testCase =
				new	TuplePairTestCase1 ();
		
		testCase.testConstruction();
		
		testCase.testEquals();
		
		testCase.testNotEquals();
		
	}
	
}
