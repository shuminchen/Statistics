package edu.brandeis.cs12b.pa5.reductions;

import edu.brandeis.cs12b.pa5.data.Data;

/**
 * Compute the average value of a dataset. You may wish to override the
 * "reduce" method here. However, you do not have to do so. Google for "streaming average"
 * or "moving average".
 * 
 * You  may wish to use your SumReduction class here. 
 * 
 *
 */
public class MeanReduction extends Reduction {

	@Override
	public double reduce(Data d) {
		// TODO implement me
		Reduction r = new SumReduction();
		return r.reduce(d)/d.getLength();
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
