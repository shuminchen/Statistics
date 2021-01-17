package edu.brandeis.cs12b.pa5.correlators;

import edu.brandeis.cs12b.pa5.data.Data;
import edu.brandeis.cs12b.pa5.reductions.MeanReduction;
import edu.brandeis.cs12b.pa5.reductions.Reduction;
import edu.brandeis.cs12b.pa5.reductions.SumReduction;

/**
 * Computes the Pearson's correlation between two samples, as defined here:
 * https://en.wikipedia.org/wiki/Pearson_product-moment_correlation_coefficient#For_a_sample 
 *
 */
public class PearsonsCorrelator implements Correlator {

	@Override
	public double correlate(Data d1, Data d2) {
		// TODO implement me!
		Reduction getMean = new MeanReduction();
		int length = getMinLength(d1,d2);
		double d1mean, d2mean;
	
		if (length==d1.getLength()) {
			d1mean = getMean.reduce(d1);
			d2mean = getMean(d2, length);
		} else {
			d1mean = getMean(d1, length);
			d2mean = getMean.reduce(d2);
		}
		
		return getPearson(d1, d1mean, d2, d2mean, length);

	}
	
	
	@Override
	public int getMinLength(Data d1, Data d2) {
		return (int)Math.min(d1.getLength(), d2.getLength()) ;
	}
	
	
	
	public double getMean(Data d, int length) {
		Reduction getSum = new SumReduction();
		double sum = getSum.reduce(d); 
		for(int j = length; j< d.getLength();j++) {
			sum-=d.getValueAt(j);
		}
		
		return sum/length;
	}
	
	
	
	public double getPearson(Data d1, double d1mean, Data d2, double d2mean, int length) {
		double sum1 = 0.0;
		double sum2 = 0.0;
		double sum3 = 0.0;
		for (int i =0;i<length;i++) {
			sum1+=(d1.getValueAt(i)-d1mean)*(d2.getValueAt(i)-d2mean);
			sum2+=(d1.getValueAt(i)-d1mean)*(d1.getValueAt(i)-d1mean);
			sum3+=(d2.getValueAt(i)-d2mean)*(d2.getValueAt(i)-d2mean);
		}
		
		return sum1/(Math.sqrt(sum2)*Math.sqrt(sum3));
		
	}

}
