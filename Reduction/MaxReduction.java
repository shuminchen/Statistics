package edu.brandeis.cs12b.pa5.reductions;

/**
 * Compute the maximum value of a dataset
 * 
 * Do not override the "reduce" method.
 *
 */
public class MaxReduction extends Reduction {

	@Override
	protected double accum(double prev, double next) {
		// TODO implement me
		if (prev>next) {
			return prev;
		}else {
			return next;
		}
		
	}

	@Override
	protected double initialValue() {
		// TODO implement me
		return Double.NEGATIVE_INFINITY;
	}

	

}
