package edu.brandeis.cs12b.pa5.reductions;

import edu.brandeis.cs12b.pa5.data.Data;
import edu.brandeis.cs12b.pa5.data.IterableData;

/**
 * This abstract class defines the basic methods needed for implementing an
 * accumlator or a reducer. Reduction operations are operations that take a dataset
 * to a single value, like a sum or a minimum.
 * 
 *
 */
public abstract class Reduction {
	
	/**
	 * Defines how to add a value to the accumulator
	 * @param prev the previous value of the accumulator
	 * @param next the next value, to be added to accumulator using some operation
	 * @return the new value of the accumulator
	 */
	protected abstract double accum(double prev, double next);
	
	/**
	 * Defines the initial value the accumlator will take on, which will be used
	 * as the first "prev" value in calls to accum
	 * @return the initial value of the accumulator
	 */
	protected abstract double initialValue();
	
	/**
	 * Performs a reduction on the dataset provided and returns the result.
	 * @param d the dataset to compute on
	 * @return the reduction
	 */
	public double reduce(Data d) {
		double start = initialValue();
		
		for (Double i : new IterableData(d)) {
			start = accum(start, i);
		}
		
		return start;
	}
}
