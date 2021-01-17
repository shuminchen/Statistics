package edu.brandeis.cs12b.pa5.data;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Here, you will implement a wrapper class that takes in a
 * Data object and makes it iterable by adding an iterator method. The
 * iterator method should return a new Iterator<Double> object with appropriate
 * "hasNext" and "next" methods.
 * 
 *
 */
public final class IterableData implements Iterable<Double> {
	private final Data d;
	
	/**
	 * Takes in a data object such that the iterator() method will
	 * return an iterator over that object.
	 * 
	 * @param d the data object to iterate over
	 */
	public IterableData(Data d) {
		// TODO implement me!
		this.d=d;
	}
	
	@Override
	public Iterator<Double> iterator() {
		
		// below is the syntax for creating and returning a new
		// anonymous class. See here for more info: https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html
	
		return new Iterator<Double>() {

			private int cursor = 0;

			@Override
			public boolean hasNext() {
				return this.cursor < IterableData.this.d.getLength();
			}

			@Override
			public Double next() {
				 if(this.hasNext()) {
		                double current = IterableData.this.d.getValueAt(cursor);
		                cursor ++;
		                return current;
		            }
		            throw new NoSuchElementException();
			}
			
		};
	}

}
