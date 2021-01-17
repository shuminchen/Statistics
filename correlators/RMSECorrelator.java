package edu.brandeis.cs12b.pa5.correlators;

import edu.brandeis.cs12b.pa5.data.Data;

/**
 * Computes the root mean squared error between two samples, defined as
 * the square root of the average squared error between each datapoint.
 * 
 * sqrt(sum((x_i - y_i)^2) / n)
 * 
 *
 */
public class RMSECorrelator implements Correlator {

	@Override
	public double correlate(Data d1, Data d2) {
		// TODO implement me!
		int length = getMinLength(d1,d2);
		double sum = 0;
		for (int i = 0; i<length; i++ ) {
			sum += Math.pow((d1.getValueAt(i)-d2.getValueAt(i)),2);
		}
		return Math.sqrt(sum/length);
	}

	
	
	public int getMinLength(Data d1, Data d2) {
		return (int)Math.min(d1.getLength(), d2.getLength()) ;
	}

}
