package edu.brandeis.cs12b.pa5.reductions;

import edu.brandeis.cs12b.pa5.data.IterableData;

/**
 * Return the sum of the dataset. Do not override "reduce".
 * 
 *
 */
public class SumReduction extends Reduction {
	@Override
	protected double accum(double prev, double next) {
		// TODO implement me
		return prev+next;	
	}

	

	@Override
	protected double initialValue() {
		return 0.0;
	
	}

}
