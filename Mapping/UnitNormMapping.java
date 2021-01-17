package edu.brandeis.cs12b.pa5.mappings;

import edu.brandeis.cs12b.pa5.data.Data;
import edu.brandeis.cs12b.pa5.reductions.MaxReduction;
import edu.brandeis.cs12b.pa5.reductions.MinReduction;
import edu.brandeis.cs12b.pa5.reductions.Reduction;
import edu.brandeis.cs12b.pa5.reductions.SumReduction;

/**
 * Here, you will implement a mapper that normalizes the values of a dataset to be
 * in between 0 and 1. To do this, apply to each data item the following formula:
 * 
 * norm = (x_i - min(x)) / (max(x) - min(x))2
 * 
 * You should compute the minimum and maximum of the dataset in the constructor, taking
 * advantage of your MinReduction and MaxReduction classes.
 * 
 * 
 *
 */
public class UnitNormMapping implements Mapping {
	private double max;
	private double min;
	
	public UnitNormMapping(Data d) {
		// TODO implement me
		Reduction getMax = new MaxReduction();
		Reduction getMin = new MinReduction();
		this.max = getMax.reduce(d);
		this.min = getMin.reduce(d);
	}
	
	@Override
	public double mapItem(double d) {
		// TODO implement me
		return (d-this.min)/(this.max-this.min);
	}

}
