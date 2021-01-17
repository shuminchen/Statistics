package edu.brandeis.cs12b.pa5.correlators;

import edu.brandeis.cs12b.pa5.data.Data;

/**
 * A correlator defines an interface that can compute a double value based on
 * two datasets. If the two datasets are not of the same size, you should truncate
 * the longer dataset. 
 * 
 * Note: don't actually change the longer dataset, just use fewer
 * of its data points.
 * 
 *
 */
public interface Correlator {
	public double correlate(Data d1, Data d2);
	public int getMinLength(Data d1, Data d2);
}


