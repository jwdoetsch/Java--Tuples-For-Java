package com.doetsch.tuple;

/**
 * TupleTrio is the realization of a two-element
 * tuple. It is intended to extend the functionality
 * of Java by implementing tuples. TupleTrio is 
 * immutable. 
 *  
 * @author Jacob Wesley Doetsch
 *
 * @param <A> The data-type of the first element in
 * 				the tuple.
 * @param <B> The data-type of the second element in
 * 				the tuple.
 * @param <C> The data-type of the third element in
 * 				the tuple.
 */
public class TupleTrio <A, B, C> {
	/**
	 * Holds the first element in the tuple.
	 */
	public final A a;
	
	/**
	 * Holds the second element in the tuple.
	 */	
	public final B b;
	
	/**
	 * Holds the third element in the tuple.
	 */	
	public final C c;
	
	/**
	 * Instantiate a new three-element tuple TupleTrio.
	 * @param a The value of the first element in the
	 * 			tuple.
	 * @param b The value of the second element in the
	 * 			tuple.
	 * @param c The value of the third element in the
	 * 			tuple.	 */	
	public TupleTrio (A a, B b, C c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	/**
	 * Evaluates the equality of two tuples. Calls
	 * the .equals() method for each element's type
	 * comparing it to the opposing tuple's elements.
	 * @param t The tuple of which to evaluate equality.
	 * @return True if both the first, second, and third
	 * elements in the tuples are equal.
	 */
	public boolean equals (TupleTrio<A, B, C> t) {
		return a.equals(t.a)
				&& b.equals(t.b)
				&& c.equals(t.c);
	}
	
	/**
	 * @return A string representation of the tuple.
	 * @see Object.toString()
	 */
	@Override
	public String toString () {
		return "([" + a.toString() + "], [" +
				 b.toString() + "], [" +
				c.toString() + "])";
	}
	
}
