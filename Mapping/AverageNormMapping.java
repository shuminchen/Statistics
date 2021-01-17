package edu.brandeis.cs12b.pa5.mappings;

import edu.brandeis.cs12b.pa5.data.Data;
import edu.brandeis.cs12b.pa5.reductions.MeanReduction;
import edu.brandeis.cs12b.pa5.reductions.Reduction;
import edu.brandeis.cs12b.pa5.reductions.SumReduction;

/**
 * Here, you will implement an average norm mapping. Divide each datapoint by the
 * average of the entire dataset provided in the constructor. You should compute the average of the dataset in the
 * constructor.
 * 
 *
 */
public class AverageNormMapping implements Mapping {
	private double average;
	
	
	public AverageNormMapping(Data d) {
		// TODO implement me
		Reduction r = new MeanReduction();
		this.average = r.reduce(d);
	}
	
	@Override
	public double mapItem(double d) {
		// TODO implement me
		return d/this.average;
	}

}
