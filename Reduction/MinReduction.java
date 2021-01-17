package edu.brandeis.cs12b.pa5.reductions;

/**
 * Return the minimum of the dataset. Do not override the reduce method.
 *
 */
public class MinReduction extends Reduction {

	@Override
	protected double accum(double prev, double next) {
		// TODO implement me
		if (prev>next) {
			return next;
		}else {
			return prev;
		}
		
	}

	@Override
	protected double initialValue() {
		// TODO implement me
		return Double.POSITIVE_INFINITY;
	}
}
