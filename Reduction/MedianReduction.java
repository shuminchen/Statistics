package edu.brandeis.cs12b.pa5.reductions;

import java.util.*;

import edu.brandeis.cs12b.pa5.data.Data;
import edu.brandeis.cs12b.pa5.data.IterableData;

/**
 * Compute the median of the dataset. You may wish to override the "reduce" method
 * here.
 * 
 *
 */
public class MedianReduction extends Reduction {

	@Override
	public double reduce(Data d) {
		double[] temp = new double[d.getLength()];
		for (int i=0;i<d.getLength();i++) {
			temp[i]=d.getValueAt(i);
		}
		Arrays.sort(temp);
		if(d.getLength()%2==1) {
			return temp[d.getLength()/2];
		}else {
			return (temp[d.getLength()/2]+temp[d.getLength()/2-1])/2;
		}
		
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
