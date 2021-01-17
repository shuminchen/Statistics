package edu.brandeis.cs12b.pa5.reductions;

import edu.brandeis.cs12b.pa5.data.Data;

/**
 * Return the range of the dataset (the difference between the maximum and the
 * minimum). You should override reduce and use your MinReduction and MaxReduction 
 * classes.
 *
 */
public class RangeReduction extends Reduction {

	@Override
	public double reduce(Data d) {
		// TODO implement me
		Reduction max = new MaxReduction();
		Reduction min = new MinReduction();
		return max.reduce(d)-min.reduce(d);
	}

	@Override
	protected double accum(double prev, double next) {
		return 0.0;
	}

	@Override
	protected double initialValue() {
		return 0.0;
	}

}
