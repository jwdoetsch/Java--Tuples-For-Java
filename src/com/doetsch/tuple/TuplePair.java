package com.doetsch.tuple;

/**
 * TuplePair is the realization of a two-element
 * tuple. It is intended to extend the functionality
 * of Java by implementing tuples. 
 *  
 * @author Jacob Wesley Doetsch
 *
 * @param <A> The data-type of the first element in
 * 				the tuple.
 * @param <B> The data-type of the second element in
 * 				the tuple.
 */
public class TuplePair <A, B> {
	/**
	 * Holds the first element in the tuple.
	 */
	public final A a;
	
	/**
	 * Holds the second element in the tuple.
	 */	
	public final B b;
	
	/**
	 * Instantiate a new two-element tuple TuplePair.
	 * @param a The value of the first element in the
	 * 			tuple.
	 * @param b The value of the second element in the
	 * 			tuple.
	 */	
	public TuplePair (A a, B b) {
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Evaluates the equality of two tuples. Calls
	 * the .equals() method for each element's type
	 * comparing it to the opposing tuple's elements.
	 * @param t The tuple of which to evaluate equality.
	 * @return True if both the first elements in the
	 * tuples and second elements in the tuples are equal.
	 */
	public boolean equals (TuplePair<A, B> t) {
		return a.equals(t.a) && b.equals(t.b);
	}
	
	/**
	 * @return A string representation of the tuple.
	 * @see Object.toString()
	 */
	@Override
	public String toString () {
		return "([" + a.toString() + "], [" +
				b.toString() + "])";
	}
	
}
